package com.example.datastructures

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun course(navController: NavController) {
    // Remember scroll state for the column
    val scrollState = rememberScrollState()

    // Create a Column with vertical scrolling
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill the available size
            .verticalScroll(scrollState) // Enable vertical scrolling
            .padding(16.dp) // Padding around the Column
    ) {
        // Section: BUILD YOUR FOUNDATIONS
        SectionHeader("BUILD YOUR FOUNDATIONS")

        // Add individual CourseBox with clickable functionality
        CourseBox(
            imageId = R.drawable.course1,
            contentDescription = "Course 1",
            text = "Master Python Programming\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("python")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))

        CourseBox(
            imageId = R.drawable.course2,
            contentDescription = "Course 2",
            text = "Master C++ Programming\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("c++")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))

        CourseBox(
            imageId = R.drawable.course3,
            contentDescription = "Course 3",
            text = "Master Java Programming\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("java")
            }
        )
        Spacer(modifier = Modifier.height(24.dp))

        // Section: SELF-PACED COURSES
        SectionHeader("SELF-PACED COURSES")

        // Add individual CourseBox with clickable functionality
        CourseBox(
            imageId = R.drawable.image2,
            contentDescription = "Course 4",
            text = "DataStructure and Algorithms in Python\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("DSA")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))

        CourseBox(
            imageId = R.drawable.course2,
            contentDescription = "Course 5",
            text = "DataStructure and Algorithms in C++\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("DSA")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))

        CourseBox(
            imageId = R.drawable.course3,
            contentDescription = "Course 6",
            text = "DataStructure and Algorithms in Java\nFlat 50% Off\n₹199",
            onClick = {
                navController.navigate("DSA")
            }
        )
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp) // Padding at the bottom of the header
    )
}

@Composable
fun CourseBox(imageId: Int, contentDescription: String, text: String, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth() // Fill the width of the container
            .clip(RoundedCornerShape(8.dp)) // Rounded corners
            .background(Color.LightGray) // Background color
            .clickable(onClick = onClick) // Clickable modifier with provided lambda
            .padding(16.dp) // Padding around the content
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Display an image on the left side
            Image(
                painter = painterResource(id = imageId),
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(100.dp) // Adjust the size as needed
                    .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
            )

            Spacer(modifier = Modifier.width(16.dp)) // Spacing between image and text

            // Display text on the right side
            Text(
                text = text,
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}