package com.venturedive.modifiersorder

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Example2() {
    Column {


        Box(
            Modifier
                .border(1.dp, Color.Red)
                .padding(10.dp)
                .size(40.dp)
                .background(Color.Green)
        )

        Box(
            Modifier
                .padding(10.dp)
                .border(1.dp, Color.Red)
                .size(40.dp)
                .background(Color.Green)
        )

        Box(
            Modifier
                .background(Color.Green)
                .border(1.dp, Color.Red)
                .padding(10.dp)
                .size(40.dp)
        )


    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Example2Preview() {
    Example2()
}