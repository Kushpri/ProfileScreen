package com.example.profileassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileassignment.ui.theme.ProfileAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileAssignmentTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.ic_person), // Use your own drawable or placeholder
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 24.dp)
        )

        Text(
            text = "Andaz Kumar",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "member since Dec, 2020",
            fontSize = 14.sp,
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        InfoText("credit score • REFRESH AVAILABLE: 757", Color(0xFF00FF00))
        InfoText("lifetime cashback: ₹3", Color.White)
        InfoText("coins: 26,46,583", Color.White)
        InfoText("win upto ₹1000 - refer and earn", Color(0xFFFFA500))
    }
}

@Composable
fun InfoText(text: String, color: Color) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = color,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    )
}
