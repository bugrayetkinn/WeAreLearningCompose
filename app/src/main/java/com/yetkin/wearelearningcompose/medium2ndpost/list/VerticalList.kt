package com.yetkin.wearelearningcompose.medium2ndpost.list

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yetkin.wearelearningcompose.ui.theme.Purple200

@ExperimentalFoundationApi
@Composable
fun VerticalList() {

    val listState = rememberLazyListState()

    LazyColumn(state = listState, modifier = Modifier.padding(8.dp)) {

        contacts().entries.forEach {
            stickyHeader {
                Text(
                    text = "${it.key}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.LightGray)
                )
            }

            items(it.value) { name ->
                Text(text = name)
            }
        }

        item {
            Categories()
        }
    }
}

@Composable
fun Categories() {

    val listState = rememberLazyListState()

    LazyRow(
        state = listState,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Purple200)
            .padding(8.dp)
    ) {

        items(categories) { category ->
            CategoryItem(category)
        }
    }
}

@Composable
fun CategoryItem(category: String) {
    Box(
        modifier = Modifier
            .background(color = Color.LightGray, shape = RoundedCornerShape(8.dp))

    ) {
        Text(
            text = category,
            modifier = Modifier.padding(8.dp),
            color = Color.White,
            fontSize = 16.sp
        )
    }

    Spacer(modifier = Modifier.size(8.dp))
}

fun contacts(): HashMap<Char, ArrayList<String>> {
    val map = HashMap<Char, ArrayList<String>>()
    map['A'] = arrayListOf("Ahmet", "Ayşe", "Anıl")
    map['B'] = arrayListOf("Burak", "Beril", "Büşra")
    map['C'] = arrayListOf("Cenk", "Ceyda", "Cemal")
    map['D'] = arrayListOf("Derya", "Deniz", "Demet")

    return map
}

val categories = arrayListOf("Books", "TV", "Club", "Trip", "Game", "Language")