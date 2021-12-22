package com.yetkin.wearelearningcompose.medium2ndpost.button

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginButton() {

    Button(
        onClick = {
            // clicked
        },
        /*enabled = false,*/
        modifier = Modifier.width(140.dp)/*.background(color = Color.Yellow)*/,
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Yellow
        )
    ) {
        Text("Login")
        Spacer(modifier = Modifier.weight(1F))
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "arrow icon"
        )
    }
}