package com.example.etatsapp

import android.R.attr.checked
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.etatsapp.ui.theme.Orange

@Preview
@Composable
fun MainScreen(){

    var text by remember { mutableStateOf("dfqdfd") }
    val onTextChange = { newText: String ->
        text = newText
    }

    var checked by remember { mutableStateOf(true) }
    val onCheckedChange = { newChecked: Boolean ->
        checked = newChecked
    }

    Column(
        modifier = Modifier.fillMaxSize().background(color = Orange),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = onTextChange
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
        RadioButton(
            onClick = {
                checked = !checked
            },
            selected = checked
        )
    }
}