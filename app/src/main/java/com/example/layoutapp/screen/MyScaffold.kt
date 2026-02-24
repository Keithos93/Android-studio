package com.example.layoutapp.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutapp.ui.theme.Pink40
import com.example.layoutapp.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyScaffold(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = PurpleGrey40,
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Pink40,
                    titleContentColor = Color.White
                ),
                title = {
                    Text(text = "My Scaffold")
                },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = "Add"
                    )
                },
                actions = {
                    IconButton(
                        onClick = {} // PARAMETRE OBLIGATOIRE QUAND ON CREE UN BOUTTON
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Notifications,
                            contentDescription = "Add"
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.ShoppingCart,
                            contentDescription = "Add"
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Share,
                            contentDescription = "Add"
                        )
                    }


                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Pink40
            ) {
                Icon(
                    imageVector = Icons.Rounded.Add,
                    contentDescription = "Add"
                    )
            }
        }


    ){innerPadding ->
        MyLazyVerticalGrid(
            modifier = Modifier.padding(innerPadding))
    }
}