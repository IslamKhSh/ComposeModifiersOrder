package com.venturedive.modifiersorder

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Example1() {
    Column(modifier = Modifier.padding(6.dp)) {

        VentureDiveLogo(modifier = Modifier
            .background(Color.Green)
            .size(200.dp)
            .padding(24.dp)
            .border(width = 3.dp, color = Color.Black)
        )

        VentureDiveLogo(modifier = Modifier
            .padding(24.dp)
            .size(200.dp)
            .background(Color.Yellow)
            .border(width = 3.dp, color = Color.Black)
        )

        VentureDiveLogo(modifier = Modifier
            .border(width = 3.dp, color = Color.Black)
            .padding(24.dp)
            .size(200.dp)
            .background(Color.Cyan)
        )
    }
}

@Composable
fun VentureDiveLogo(modifier: Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.venturedive_logo),
        contentDescription = "VentureDive"
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Example1Preview() {
    Example1()
}