package com.yetkin.wearelearningcompose.medium2ndpost.constraint_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.yetkin.wearelearningcompose.R

@Composable
fun MyConstraintLayout() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent)
    ) {

        val (image, text) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = "icon",
            modifier = Modifier
                .size(128.dp)
                .constrainAs(image) {
                    top.linkTo(parent.top, 32.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Text(
            text = "Android Developers",
            modifier = Modifier.constrainAs(text) {
                top.linkTo(image.bottom, 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}