package com.example.navigationr.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationr.R
import com.example.navigationr.view.DetailsScreen
import com.example.navigationr.view.HomeScreen
import com.example.navigationr.view.ListScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Column(

        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(Modifier.height(12.dp))
        Box(
            modifier = Modifier
                .size(220.dp) // área para notar Fill*
                .clip(RoundedCornerShape(10.dp))
                .border(2.dp, Color.Gray, RoundedCornerShape(10.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.chi1),
                contentDescription = "Logo",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(10.dp))
                    .border(5.dp, Color.Blue, RoundedCornerShape(10.dp))
            )
        }
        NavHost(
            navController = navController,
            startDestination = "home"
        ) {
            composable("home")
            {
                HomeScreen(navController)
            }
            composable("list")
            {
                ListScreen(navController)
            }
            composable("details/{persona}")
            { backStackEntry ->
                val persona = backStackEntry.arguments?.getString("persona")
                DetailsScreen(persona, navController)
            }
        }
    }
}


