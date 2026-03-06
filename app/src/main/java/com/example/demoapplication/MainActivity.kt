package com.example.demoapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.demoapplication.module1.CheckBoxExample
import com.example.demoapplication.ui.theme.DemoApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoApplicationTheme {
                //Greeting()
                //ResourceShow()
                //SimpleText()
                //ColorFullText()
                //ScrollableText()
                //FirstOutlineTextField()
                //SimplePasswordTextField()
                //SelectableText()
                //AnnotatedStringWithListener()
                //FilledButtonExample()
                //ImageExample()
                //ColumnExample()
                //RowExample()
                //BoxExample()
                //ConstraintLayoutExample()
                //LazyColumnExample()
                //LazyRowExample()
                //BottomSheetExample()
                //ElevatedCardExample()
                CheckBoxExample()
            }
        }
    }
}
