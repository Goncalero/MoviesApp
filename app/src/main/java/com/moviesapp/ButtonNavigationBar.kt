package com.moviesapp

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun BottomNavigationBar(){

    val bottonMenuItemsList = prepareBottomMenu()
    val contextForToast = LocalContext.current.applicationContext
    var selectedItem by remember { mutableStateOf("Home") }

    NavigationBar (

        contentColor = colorResource(R.color.white),
        containerColor = colorResource(R.color.black3),

    ){
        bottonMenuItemsList.forEachIndexed{ index, bottomMenuItem ->

            if (index == 2) {
                NavigationBarItem(
                    selected= false,
                    icon = {  },
                    onClick = {},
                )
            }

            NavigationBarItem(
                selected = (selectedItem == bottomMenuItem.label),
                icon = {
                    Icon(
                        painter = bottomMenuItem.icon,
                        contentDescription = bottomMenuItem.label,

                    )

                },
                label = {
                    Text(
                        text = bottomMenuItem.label,

                    )

                },
                onClick = {
                    selectedItem = bottomMenuItem.label

                }
            )
        }
    }
}

data class BottomMenuItem(
    val label:String,
    val icon: Painter
)


@Composable
fun prepareBottomMenu():List<BottomMenuItem>{

    return listOf(

        BottomMenuItem(
            label = "Home",
            icon = painterResource(R.drawable.btn_1)

        ),

        BottomMenuItem(
            label = "Profile",
            icon = painterResource(R.drawable.btn_2)

        ),

        BottomMenuItem(
            label = "Support",
            icon = painterResource(R.drawable.btn_3)

        ),

        BottomMenuItem(
            label = "Settings",
            icon = painterResource(R.drawable.btn_4)

        )
    )

}