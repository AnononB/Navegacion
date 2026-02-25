package com.example.navigationr.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun DetailsScreen(persona: String?,navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)

     {
    Text("Se seleciono a: $persona")
       /*  Button(onClick={navController.popBackStack()}){
            Text("Atras")
        }*/
         Button(onClick={navController.navigate("home")}){
             Text("Ir a Home")
         }
    }

}
