package com.yetkin.wearelearningcompose.medium2ndpost.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp

@ExperimentalUnitApi
@Composable
fun ItemTitle(title: String) {
    // Default Text
    Text(
        text = title,
        fontSize = 24.sp,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Serif,
        fontStyle = FontStyle.Italic,
        letterSpacing = TextUnit(10F, TextUnitType.Sp), // Karakter arasına boşluk koyma
        maxLines = 1,
        overflow = TextOverflow.Ellipsis, // Clip kesiyor yazıyı - Ellipsis 3 nokta koyuyor sonuna
        textDecoration = TextDecoration.combine(
            listOf(TextDecoration.Underline, TextDecoration.LineThrough)
        ), // TextDecoration.Underline vs. -- TextDecoration.combine ile birden fazla değer verilebiliyor
    )
}