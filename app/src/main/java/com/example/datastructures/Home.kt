package com.example.datastructures

import android.annotation.SuppressLint
import android.util.Log
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
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val LavenderColor = Color(0xFF87CEEB)

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {  AppBar(
            onNavigationIconClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }
        )
            // Top app bar content goes here
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            // Drawer content goes here
            DrawerHeader()
            DrawerBody(
                items = listOf(
                    MenuItem(
                        id = "home",
                        title = "Home",
                        contentDescription = "Go to home screen",
                        icon = Icons.Default.Home
                    ),
                    MenuItem(
                        id = "Quiz",
                        title = "Quiz",
                        contentDescription = "Go to settings screen",
                        icon = Icons.Default.Settings
                    ),
                    MenuItem(
                        id = "ChatBot",
                        title = "chatbot",
                        contentDescription = "chatbot",
                        icon = Icons.Default.Info
                    ),
                    MenuItem(
                        id = "logout",
                        title = "Logout",
                        contentDescription = "Logout",
                        icon = Icons.Default.Info
                    )
                ),
                onItemClick = { item ->
                    when (item.id) {
                        "home" -> navController.navigate("home")
                        "Quiz" -> navController.navigate("Quiz")
                        "ChatBot" -> navController.navigate("ChatBot")
                        "logout" -> {
                            Log.d("Navigation", "Logging out...")
                            navController.navigate("login")
                        }
                    }
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize() .padding(bottom = 80.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                // Content of your screen goes here
                Column(
                    Modifier.fillMaxSize(),
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
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Apply a rounded corner shape
                                .clickable { navController.navigate("Introduction") }
                                .padding(25.dp), // Padding inside the Box
                        ) {
                            Text(
                                text = "Introduction",
                                color = Color.White
                            )
                        }

                        // Spacer for spacing between the boxes
                        Spacer(modifier = Modifier.width(16.dp))

                        // Second Box element for "Array"
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Apply a rounded corner shape
                                .clickable { navController.navigate("Array") }
                                .padding(25.dp), // Padding inside the Box
                        ) {
                            Text(
                                text = "Array",
                                color = Color.White
                            )
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
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Stack") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Stack",
                                color = Color.White
                            )
                        }

                        // Spacer for spacing between the boxes
                        Spacer(modifier = Modifier.width(16.dp))

                        // Second Box element for "Searching & Sorting"
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Search") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Searching & Sorting",
                                color = Color.White
                            )
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
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("LinkedList") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "LinkedList",
                                color = Color.White
                            )
                        }

                        // Spacer for spacing between the boxes
                        Spacer(modifier = Modifier.width(16.dp))

                        // Second Box element for "Tree"
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Tree") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Tree",
                                color = Color.White
                            )
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
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Graph") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Graph",
                                color = Color.White
                            )
                        }

                        // Spacer for spacing between the boxes
                        Spacer(modifier = Modifier.width(16.dp))

                        // Second Box element for "Queue"
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Queue") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Queue",
                                color = Color.White
                            )
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
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Heap") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Heap",
                                color = Color.White
                            )
                        }

                        // Spacer for spacing between the boxes
                        Spacer(modifier = Modifier.width(16.dp))

                        // Second Box element for "Structure"
                        Box(
                            modifier = Modifier
                                .size(width = 150.dp, height = 100.dp)
                                .background(Purple2, shape = RoundedCornerShape(8.dp)) // Set the background color
                                .clickable { navController.navigate("Structure") } // Handle click event
                                .padding(25.dp) // Padding inside the Box
                        ) {
                            Text(
                                text = "Structure",
                                color = Color.White
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))



                    Box(

                        modifier = Modifier
                            .size(width = 200.dp, height = 100.dp)
                            .background(Purple2, shape = RoundedCornerShape(8.dp))
                            .clickable { navController.navigate("Hash") }
                    ) {
                        Text(
                            text = "Hash", color = Color.White,
                            modifier = Modifier.padding(25.dp)
                        )

                    }
                }
                // Add other Box elements similarly

            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = LavenderColor,
            ) {
                BottomNavigationItem(
                    selected = true,
                    onClick = { navController.navigate("Home") },
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