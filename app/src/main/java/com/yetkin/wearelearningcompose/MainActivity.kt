package com.yetkin.wearelearningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.yetkin.wearelearningcompose.ui.theme.WeAreLearningComposeTheme

@ExperimentalFoundationApi
@ExperimentalUnitApi
class MainActivity : ComponentActivity() {
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeAreLearningComposeTheme {
                //ModifierText()
                //ItemTitle(title = "Android Developers")
                //SelectionItem()
                //SpannableTitle()
                //LoginButton()
                //MyColumn()
                //MyRow()
                //MyConstraintLayout()
                //VerticalList()
                //PasswordTextField()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeAreLearningComposeTheme {

    }
}