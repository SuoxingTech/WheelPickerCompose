package com.commandiron.wheel_picker_compose

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.commandiron.wheel_picker_compose.core.SelectorProperties
import com.commandiron.wheel_picker_compose.core.WheelPickerDefaults

@Composable
fun WheelPicker(
    modifier: Modifier = Modifier,
    startIndex: Int = 0,
    count: Int,
    rowCount: Int,
    size: DpSize = DpSize(128.dp, 128.dp),
    selectorProperties: SelectorProperties = WheelPickerDefaults.selectorProperties(),
    onScrollFinished: (snappedIndex: Int) -> Int? = { null },
    content: @Composable LazyItemScope.(index: Int) -> Unit,
) {
    com.commandiron.wheel_picker_compose.core.WheelPicker(
        modifier,
        startIndex,
        count,
        rowCount,
        size,
        selectorProperties,
        onScrollFinished,
        content
    )
}