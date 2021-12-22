package com.yetkin.wearelearningcompose.medium2ndpost.selection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun SelectionItem() {

    SelectionContainer {
        Column {
            Text(text = "Android Studio")
            DisableSelection {
                Text(text = "Compose")
            }
            Text(text = "Kotlin")
        }
    }
}