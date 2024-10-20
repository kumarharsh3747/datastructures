package com.example.datastructures

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

val Purple2 = Color(0xFF9370DB)


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home2(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEFEFEF) // Light gray background
    ) {

        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                AppBar2(
                    onBackButtonClick = {
                        // Define what happens when the back button is clicked
                        navController.popBackStack()
                    }
                )
            },
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize().padding(bottom = 80.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    // Content of your screen goes here
                    Column(
                        Modifier.fillMaxSize() ,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth() // Row spans the full width of the screen
                                .padding(16.dp), // Optional padding around the row
                            horizontalArrangement = Arrangement.SpaceBetween // Distribute children evenly within the row
                        ) {
                            // First Box element for "Introduction"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("home2") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.dsa), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "Data Structure",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }


                            // Spacer for spacing between the boxes
                            Spacer(modifier = Modifier.width(16.dp))

                            // Second Box element for "Array"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("Javaa") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.java), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "java",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth() // Row spans the full width of the screen
                                .padding(16.dp), // Optional padding around the row
                            horizontalArrangement = Arrangement.SpaceBetween // Distribute children evenly within the row
                        ) {
                            // First Box element for "Stack"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 25.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("os") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.os), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "OS",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                            // Spacer for spacing between the boxes
                            Spacer(modifier = Modifier.width(16.dp))

                            // Second Box element for "Searching & Sorting"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("web") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.web), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "Web devloper",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth() // Row spans the full width of the screen
                                .padding(16.dp), // Optional padding around the row
                            horizontalArrangement = Arrangement.SpaceBetween // Distribute children evenly within the row
                        ) {
                            // First Box element for "LinkedList"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("app") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.android), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "Android Devloper",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                            // Spacer for spacing between the boxes
                            Spacer(modifier = Modifier.width(16.dp))

                            // Second Box element for "Tree"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("dbms") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.database), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "DBMS",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth() // Row spans the full width of the screen
                                .padding(16.dp), // Optional padding around the row
                            horizontalArrangement = Arrangement.SpaceBetween // Space boxes evenly within the row
                        ) {
                            // First Box element for "Graph"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("cpp") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.c), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "C++",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }



                            // Spacer for spacing between the boxes
                            Spacer(modifier = Modifier.width(16.dp))

                            // Second Box element for "Queue"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("ml") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.ml), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "Machine Learning",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth() // Row spans the full width of the screen
                                .padding(16.dp), // Optional padding around the row
                            horizontalArrangement = Arrangement.SpaceBetween // Distribute children evenly within the row
                        ) {
                            // First Box element for "Heap"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("c") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.cpp), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "C",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }


                            // Spacer for spacing between the boxes
                            Spacer(modifier = Modifier.width(16.dp))

                            // Second Box element for "Structure"
                            Box(
                                modifier = Modifier
                                    .size(width = 150.dp, height = 100.dp)
                                    .shadow(
                                        elevation = 15.dp, // Adjust elevation as needed for a stronger shadow effect
                                        shape = RoundedCornerShape(8.dp) // Define the shape for shadow
                                    )
                                    .background(
                                        color = Color.White, // Background color for the Box
                                        shape = RoundedCornerShape(8.dp) // Same shape as shadow to maintain consistency
                                    )
                                    .clickable { navController.navigate("Python") } // Handle click event
                                    .padding(15.dp), // Padding inside the Box
                                contentAlignment = Alignment.Center // Center content inside the Box
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    // Display an image using the Image composable
                                    Image(
                                        painter = painterResource(id = R.drawable.python), // Replace your_image_id with your image resource ID
                                        contentDescription = "Data Structure Icon", // Provide a content description for accessibility
                                        modifier = Modifier.size(50.dp, 50.dp) // Adjust size as needed
                                    )

                                    // Display text using Text composable, positioned at the bottom of the image
                                    Spacer(modifier = Modifier.height(5.dp)) // Add space between image and text if necessary

                                    Text(
                                        text = "Python",
                                        color = Color.Black,
                                        textAlign = TextAlign.Center // Center the text within the column
                                    )
                                }
                            }

                        }

                        Spacer(modifier = Modifier.height(16.dp))


                    }
                    // Add other Box elements similarly

                }
            },
            bottomBar = {
                BottomAppBar(
                    modifier = Modifier.fillMaxWidth(),
                    backgroundColor = Color.White,
                ) {
                    BottomNavigationItem(
                        selected = true,
                        onClick = { navController.navigate("home") },
                        icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                        label = { Text("Home") }
                    )
                    BottomNavigationItem(
                        selected = false,
                        onClick = { navController.navigate("course") },
                        icon = { Icon(Icons.Filled.Menu, contentDescription = "Courses") },
                        label = { Text("Courses") }
                    )
                    BottomNavigationItem(
                        selected = false,
                        onClick = { navController.navigate("Post") },
                        icon = { Icon(Icons.Filled.Search, contentDescription = "Explore") },
                        label = { Text("Explore") }
                    )
                    BottomNavigationItem(
                        selected = false,
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

}

@Composable
fun AppBar2(
    onBackButtonClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Category")
        },
        backgroundColor = Color.White,
        contentColor = Color.Black, // Set content color to black
        navigationIcon = {
            IconButton(onClick = onBackButtonClick) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black // Explicitly set the icon color to black
                )
            }
        }
    )
}