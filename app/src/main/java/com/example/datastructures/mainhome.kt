package com.example.datastructures
import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
@Composable
fun InfiniteLoopedImageBox(
    image1: Painter,
    image2: Painter,
    image3: Painter,
    stopTime: Long = 2000 // Time in milliseconds to stop at each image,
    ,navController: NavController
) {
    // List of images to cycle through
    val images = listOf(image1, image2, image3)

    // Current index state
    var currentIndex by remember { mutableStateOf(0) }

    // Timer effect to cycle through images
    LaunchedEffect(currentIndex) {
        // Delay for the stop time at the current image
        delay(stopTime)

        // Increment the index to cycle through images
        currentIndex = (currentIndex + 1) % images.size
    }

    // Create a Column with a Box to display the images
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill the available size
            .verticalScroll(rememberScrollState()) // Add scrolling to the column
            .padding(16.dp), // Optional padding around the Column
        horizontalAlignment = Alignment.CenterHorizontally // Center the content horizontally
    ) {
        // Display the current image in a Box
        Box(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp) // Size of the Box
                .background(Color.White) // Background color
        ) {
            Image(
                painter = images[currentIndex],
                contentDescription = "Image ${currentIndex + 1}",
                modifier = Modifier.fillMaxSize() // Fill the Box
            )
        }

        // You can add other content below the Box if needed
        Spacer(modifier = Modifier.height(16.dp)) // Optional spacing below the Box

        Text(text = "Recommended for you",fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Add horizontal scrolling
                .padding(vertical = 8.dp), // Adjust padding as needed
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Space between boxes
        ) {

            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .clickable { navController.navigate("python") }
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Display an image
                    Image(
                        painter = painterResource(id = R.drawable.course1), // Use your image resource ID
                        contentDescription = "Box Image",
                        modifier = Modifier.size(100.dp, 100.dp)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    // Display text below the image
                    Text(
                        text = "Python in 4 hours \nonly at ₹199",
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }}
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .clickable { navController.navigate("c++") }
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Display an image
                    Image(
                        painter = painterResource(id = R.drawable.course2), // Use your image resource ID
                        contentDescription = "Box Image",
                        modifier = Modifier.size(100.dp, 100.dp)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    // Display text below the image
                    Text(
                        text = "Learn C++ in 31 hours\nonly at ₹499",
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }}
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .clickable {navController.navigate("java")}
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Display an image
                    Image(
                        painter = painterResource(id = R.drawable.course3), // Use your image resource ID
                        contentDescription = "Box Image",
                        modifier = Modifier.size(100.dp, 100.dp)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    // Display text below the image
                    Text(
                        text = "Java programming\nonly at ₹399",
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }}
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .clickable { navController.navigate("course")/* Handle box click */ }
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Display an imag

                    // Display text below the image
                    Text(
                        text = "See all",
                        color = Color.Blue,
                        textAlign = TextAlign.Center, modifier = Modifier.clickable(onClick = { navController.navigate("course") })

                    )

                }}
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Popular Now",fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Spacer(modifier = Modifier.height(10.dp))
        Row{ Box(
            modifier = Modifier
                .size(width = 150.dp, height = 150.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
                .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                .clickable {navController.navigate("java")}
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Display an image
                Image(
                    painter = painterResource(id = R.drawable.course3), // Use your image resource ID
                    contentDescription = "Box Image",
                    modifier = Modifier.size(100.dp, 100.dp)
                )

                Spacer(modifier = Modifier.height(2.dp))

                // Display text below the image
                Text(
                    text = "Java programming\nonly at ₹399",
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

            }}
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .clickable {navController.navigate("c")}
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Display an image
                    Image(
                        painter = painterResource(id = R.drawable.course4), // Use your image resource ID
                        contentDescription = "Box Image",
                        modifier = Modifier.size(100.dp, 100.dp)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    // Display text below the image
                    Text(
                        text = "Deep Learning\nonly at ₹999",
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }}}

    }
}
@Composable
fun ExampleUsage(navController: NavController) {
    // Define the images to be used in InfiniteLoopedImageBox
    val image1 = painterResource(id = R.drawable.image1)
    val image2 = painterResource(id = R.drawable.image2)
    val image3 = painterResource(id = R.drawable.image3)

    // Use Scaffold to provide a layout structure
    Scaffold(
        topBar = {
            // Set AppBar3 as the top app bar
            AppBar3(navController)
        },
        content = { paddingValues ->
            // Call InfiniteLoopedImageBox as the content of the screen
            // Pass paddingValues from Scaffold to avoid content overlap
            Box(modifier = Modifier.padding(paddingValues)) {
                InfiniteLoopedImageBox(
                    image1 = image1,
                    image2 = image2,
                    image3 = image3,
                    stopTime = 3000, // Adjust stop time as needed (in milliseconds)
                    navController = navController
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = Color.White,
                modifier = Modifier.fillMaxWidth(),
            ) {
                BottomNavigationItem(
                    selected = navController.currentDestination?.route == "home",
                    onClick = { navController.navigate("home") },
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") }
                )
                BottomNavigationItem(
                    selected = navController.currentDestination?.route == "course",
                    onClick = { navController.navigate("course") },
                    icon = { Icon(Icons.Filled.Menu, contentDescription = "Courses") },
                    label = { Text("Courses") }
                )
                BottomNavigationItem(
                    selected = navController.currentDestination?.route == "post",
                    onClick = { navController.navigate("Post") },
                    icon = { Icon(Icons.Filled.Search, contentDescription = "Explore") },
                    label = { Text("Explore") }
                )
                BottomNavigationItem(
                    selected = navController.currentDestination?.route == "profile",
                    onClick = { navController.navigate("Profile") },
                    icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
                    label = { Text("Profile") }
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate("ChatBot") },
                modifier = Modifier.padding(16.dp)
            ) {
                // Set the "+" icon in the FAB using Icons.Default.Add
                Icon(
                    imageVector = Icons.Default.Chat, // Assuming "Chat" is the name of the chatbot icon
                    contentDescription = "Chatbot",
                    tint = MaterialTheme.colors.onSecondary
                )

            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
    )
}
@Composable
fun AppBar3(
    navController: NavController,

    ) {
    TopAppBar(
        title = {
            Text(text = "Welcome")
        },
        backgroundColor = Color.White,
        contentColor = Color.Black, // Set content color to black
        navigationIcon = {
            // Wrap the image in a Box to add padding
            Box(
                modifier = Modifier.padding(start = 8.dp) // Add left padding to the image
            ) {
                Image(
                    painter = painterResource(id = R.drawable.sc),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(40.dp) // Adjust the size as needed
                        .clip(CircleShape)
                        .clickable { navController.navigate("Profile") } // Use navController here
                )
            }
        }
    )
}