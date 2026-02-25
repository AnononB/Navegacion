package com.example.navigationr.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ListScreen (navController: NavController){
    val personas = listOf("Goytia","Villa","Memo Blanco", "Isael", "Ing. Mota")

    LazyColumn(
        modifier = Modifier.fillMaxSize(),

    )
    {
       items(personas){
           persona ->

           Text(

               text = persona,
               modifier = Modifier.fillMaxSize().clickable {
                   navController.navigate("details/$persona")
               }.padding(16.dp)
           )
       }
    }
}