package com.yetkin.wearelearningcompose.medium2ndpost.column

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyColumn() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        TextField(value = "email", onValueChange = {}, modifier = Modifier.padding(top = 32.dp))
        TextField(value = "password", onValueChange = {}, modifier = Modifier.padding(top = 8.dp))
        Button(onClick = {}, modifier = Modifier.padding(top = 16.dp)) {
            Text("Login")
        }
    }
}