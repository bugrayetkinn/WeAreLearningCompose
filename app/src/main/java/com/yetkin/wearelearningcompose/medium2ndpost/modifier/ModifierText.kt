package com.yetkin.wearelearningcompose.medium2ndpost.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ModifierText() {

    val scrollState = rememberScrollState()
    val focusRequester = FocusRequester()

    Box(
        modifier = Modifier
            .background(color = Color.Yellow)
            .fillMaxWidth()
    ) {
        Text(
            text = "Android Developers - Google - Facebook",
            fontSize = 24.sp,
            modifier = Modifier
                //.fillMaxWidth() // bulunduğu content'in en uzun boyutunu alır
                //.fillMaxHeight() // bulunduğu content'in en yüksek boyutunu alır
                .size(width = 140.dp, height = 200.dp)
                .clip(CircleShape)
                .padding(start = 8.dp, top = 16.dp, end = 8.dp, bottom = 16.dp)
                .horizontalScroll(state = scrollState)
                .focusRequester(focusRequester = focusRequester)
                /*.background(
                    color = Color.White,
                    shape = CircleShape
                )*/
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Blue,
                            Color.White,
                            Color.Gray
                        )
                    )
                )
                .shadow(8.dp)
                .clickable(
                    enabled = true,
                    onClick = {

                    }
                )
            /*.clickable {

            }*/
        )
    }
}