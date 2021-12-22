package com.yetkin.wearelearningcompose.medium2ndpost.text

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpannableTitle() {

    val message = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                color = Color.Red,
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold
            )
        ) {
            append("K\n")
        }
        append("O\n")
        append("T\n")
        append("L\n")
        append("I\n")
        append("N\n\n")

        pushStringAnnotation(tag = "CODE LAB URL", annotation = "www.codelabs.com")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                fontSize = 16.sp,
                textDecoration = TextDecoration.Underline
            )
        ) {
            append("codelab")
        }
    }

    ClickableText(text = message, modifier = Modifier.padding(16.dp), onClick = { offset ->
        message.getStringAnnotations("CODE LAB URL", offset, offset).firstOrNull()?.let {
            Log.e("codelab url : ", it.item)
        }
    })
}