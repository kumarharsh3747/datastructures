package com.example.datastructures

import android.widget.VideoView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController


@Composable
fun C(navController: NavController) {
    // Define the image and course details for the Java programming course
    val courseImageId = R.drawable.c// The resource ID of the Java course image
    val courseDescription = "Welcome to our comprehensive 31-hour C++ programming course! Whether you're a beginner looking to start your journey in programming or an experienced developer wanting to add C++ to your skill set, this course is designed to provide you with a solid foundation and in-depth understanding of one of the most powerful and widely-used programming languages in the world.\n" +
            "\n" +
            "What You'll Learn:\n" +
            "\n" +
            "Introduction to C++: Get acquainted with the history, features, and advantages of C++ programming language.\n" +
            "\n" +
            "Basic Syntax and Data Types: Understand fundamental C++ concepts such as variables, data types, and operators.\n" +
            "\n" +
            "Control Structures: Learn how to control the flow of your program using if statements, loops, and switch statements.\n" +
            "\n" +
            "Functions: Understand how to define and use functions, pass parameters, and return values.\n" +
            "\n" +
            "Object-Oriented Programming (OOP): Dive into the core concepts of OOP such as classes, objects, inheritance, polymorphism, and encapsulation.\n" +
            "\n" +
            "Pointers and Memory Management: Learn how to work with pointers and dynamic memory allocation.\n" +
            "\n" +
            "Exception Handling: Understand how to handle errors and exceptions to make your programs robust and reliable.\n" +
            "\n" +
            "Standard Template Library (STL): Discover how to use STL's powerful data structures and algorithms, such as vectors, lists, and maps.\n" +
            "\n" +
            "File Handling: Explore how to read from and write to files using C++.\n" +
            "\n" +
            "Advanced Topics: Delve into more complex concepts like lambda functions, templates, and multithreading."
    val coursePrice = "Price: ₹199"

    // Create a Column for the course detail UI
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling if needed
    ) {
        // Display the course image
        Image(
            painter = painterResource(id = courseImageId),
            contentDescription = "Java Course Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
                .height(200.dp) // Adjust the height as needed
                .background(Color.LightGray) // Optional: background color
        )

        // Add spacing between the image and description
        Spacer(modifier = Modifier.height(16.dp))

        // Display the course description
        Text(
            text = courseDescription,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Display the course price
        Text(
            text = coursePrice,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Display the "Pay" button
        Button(
            onClick = {
                // Handle payment logic here
            },
            //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Pay", color = Color.White)
        }

        val context = LocalContext.current
        val videoView = remember { VideoView(context) }
        var isPlaying by remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Demo ", color = Color.Black)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // Adjust height as needed
        ) {
            AndroidView(
                factory = { videoView },
                modifier = Modifier.fillMaxSize(),
                update = {
                    it.setVideoPath("android.resource://${context.packageName}/${R.raw.sample_video}")
                    it.start()
                }
            )

        }
        androidx.compose.material.Button(
            onClick = {
                if (isPlaying) {
                    videoView.pause()
                } else {
                    videoView.start()
                }
                isPlaying = !isPlaying
            },
            //modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
        ) {
            androidx.compose.material.Text(text = if (isPlaying) "Pause" else "Play")
        }
    }}

@Composable
fun Java(navController: NavController) {
    // Define the image and course details for the Java programming course
    val courseImageId = R.drawable.course3// The resource ID of the Java course image
    val courseDescription = "Welcome to our in-depth 31-hour Java programming course! Whether you are new to programming or an experienced developer looking to learn Java, this course offers a thorough introduction and advanced exploration of one of the most versatile and popular programming languages in the world.\n" +
            "\n" +
            "What You'll Learn:\n" +
            "\n" +
            "Introduction to Java: Learn about the origins and applications of Java, its features, and its benefits in the modern programming landscape.\n" +
            "\n" +
            "Basic Syntax and Data Types: Understand the fundamental components of Java, including variables, data types, and operators.\n" +
            "\n" +
            "Control Structures: Master the control flow of your programs using conditional statements and loops.\n" +
            "\n" +
            "Functions and Methods: Learn how to define and use functions (methods) to create reusable code blocks.\n" +
            "\n" +
            "Object-Oriented Programming (OOP): Dive into core OOP concepts such as classes, objects, inheritance, polymorphism, and encapsulation.\n" +
            "\n" +
            "Collections Framework: Explore Java's powerful collections framework, including lists, sets, and maps.\n" +
            "\n" +
            "Exception Handling: Learn how to manage errors and exceptions effectively for more robust and reliable code.\n" +
            "\n" +
            "Java Standard Library: Familiarize yourself with important classes and utilities in the Java Standard Library.\n" +
            "\n" +
            "File Handling and I/O: Understand how to work with files and perform input/output operations using Java.\n" +
            "\n" +
            "Concurrency and Multithreading: Learn how to write efficient, concurrent programs using Java’s multithreading capabilities.\n" +
            "\n" +
            "Introduction to JavaFX: Get a taste of creating graphical user interfaces (GUIs) with JavaFX.\n" +
            "\n" +
            "Advanced Topics: Explore more complex subjects such as lambdas, streams, and functional programming features.\n" +
            "\n" +
            "Why Take This Course:\n" +
            "\n" +
            "Hands-On Practice: Apply your knowledge through exercises and projects that build real-world skills.\n" +
            "\n" +
            "Expert Instruction: Learn from experienced instructors who are passionate about Java and programming.\n" +
            "\n" +
            "Community Support: Join a network of learners and get support from peers and instructors as you progress through the course.\n" +
            "\n" +
            "Flexible Learning: Access course materials at your own pace and on your schedule, accommodating your learning style and needs."
    val coursePrice = "Price: ₹199"

    // Create a Column for the course detail UI
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling if needed
    ) {
        // Display the course image
        Image(
            painter = painterResource(id = courseImageId),
            contentDescription = "Java Course Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
                .height(200.dp) // Adjust the height as needed
                .background(Color.LightGray) // Optional: background color
        )

        // Add spacing between the image and description
        Spacer(modifier = Modifier.height(16.dp))

        // Display the course description
        Text(
            text = courseDescription,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Display the course price
        Text(
            text = coursePrice,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Display the "Pay" button
        Button(
            onClick = {
                // Handle payment logic here
            },
            //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Pay", color = Color.White)
        }

        val context = LocalContext.current
        val videoView = remember { VideoView(context) }
        var isPlaying by remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Demo ", color = Color.Black)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // Adjust height as needed
        ) {
            AndroidView(
                factory = { videoView },
                modifier = Modifier.fillMaxSize(),
                update = {
                    it.setVideoPath("android.resource://${context.packageName}/${R.raw.java}")
                    it.start()
                }
            )

        }
        androidx.compose.material.Button(
            onClick = {
                if (isPlaying) {
                    videoView.pause()
                } else {
                    videoView.start()
                }
                isPlaying = !isPlaying
            },
            //modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
        ) {
            androidx.compose.material.Text(text = if (isPlaying) "Pause" else "Play")
        }
    }}
@Composable
fun Python(navController: NavController) {
    // Define the image and course details for the Java programming course
    val courseImageId = R.drawable.course1// The resource ID of the Java course image
    val courseDescription = "Welcome to our comprehensive 31-hour Python programming course! Whether you're new to programming or an experienced developer looking to add Python to your skill set, this course is designed to provide you with a strong foundation and in-depth understanding of one of the most popular and versatile programming languages in the world."
    val coursePrice = "Price: ₹199"

    // Create a Column for the course detail UI
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling if needed
    ) {
        // Display the course image
        Image(
            painter = painterResource(id = courseImageId),
            contentDescription = "Java Course Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
                .height(200.dp) // Adjust the height as needed
                .background(Color.LightGray) // Optional: background color
        )

        // Add spacing between the image and description
        Spacer(modifier = Modifier.height(16.dp))

        // Display the course description
        Text(
            text = courseDescription,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Display the course price
        Text(
            text = coursePrice,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Display the "Pay" button
        Button(
            onClick = {
                // Handle payment logic here
            },
            //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Pay", color = Color.White)
        }

        val context = LocalContext.current
        val videoView = remember { VideoView(context) }
        var isPlaying by remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Demo ", color = Color.Black)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // Adjust height as needed
        ) {
            AndroidView(
                factory = { videoView },
                modifier = Modifier.fillMaxSize(),
                update = {
                    it.setVideoPath("android.resource://${context.packageName}/${R.raw.python}")
                    it.start()
                }
            )

        }
        androidx.compose.material.Button(
            onClick = {
                if (isPlaying) {
                    videoView.pause()
                } else {
                    videoView.start()
                }
                isPlaying = !isPlaying
            },
            //modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
        ) {
            androidx.compose.material.Text(text = if (isPlaying) "Pause" else "Play")
        }
    }}

@Composable
fun Datastrucre(navController: NavController) {
    // Define the image and course details for the Java programming course
    val courseImageId = R.drawable.image2// The resource ID of the Java course image
    val courseDescription = "Master Java Programming with this comprehensive course.\nLearn advanced topics and best practices."
    val coursePrice = "Price: ₹199"

    // Create a Column for the course detail UI
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling if needed
    ) {
        // Display the course image
        Image(
            painter = painterResource(id = courseImageId),
            contentDescription = "Java Course Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
                .height(200.dp) // Adjust the height as needed
                .background(Color.LightGray) // Optional: background color
        )

        // Add spacing between the image and description
        Spacer(modifier = Modifier.height(16.dp))

        // Display the course description
        Text(
            text = courseDescription,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Display the course price
        Text(
            text = coursePrice,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Display the "Pay" button
        Button(
            onClick = {
                // Handle payment logic here
            },
            //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Pay", color = Color.White)
        }

        val context = LocalContext.current
        val videoView = remember { VideoView(context) }
        var isPlaying by remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Demo ", color = Color.Black)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // Adjust height as needed
        ) {
            AndroidView(
                factory = { videoView },
                modifier = Modifier.fillMaxSize(),
                update = {
                    it.setVideoPath("android.resource://${context.packageName}/${R.raw.sample_video}")
                    it.start()
                }
            )

        }
        androidx.compose.material.Button(
            onClick = {
                if (isPlaying) {
                    videoView.pause()
                } else {
                    videoView.start()
                }
                isPlaying = !isPlaying
            },
            //modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
        ) {
            androidx.compose.material.Text(text = if (isPlaying) "Pause" else "Play")
        }
    }}
@Composable
fun Cpp(navController: NavController) {
    // Define the image and course details for the Java programming course
    val courseImageId = R.drawable.course2// The resource ID of the Java course image
    val courseDescription = "Master Java Programming with this comprehensive course.\nLearn advanced topics and best practices."
    val coursePrice = "Price: ₹199"

    // Create a Column for the course detail UI
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling if needed
    ) {
        // Display the course image
        Image(
            painter = painterResource(id = courseImageId),
            contentDescription = "Java Course Image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)) // Optional: rounded corners
                .height(200.dp) // Adjust the height as needed
                .background(Color.LightGray) // Optional: background color
        )

        // Add spacing between the image and description
        Spacer(modifier = Modifier.height(16.dp))

        // Display the course description
        Text(
            text = courseDescription,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        // Display the course price
        Text(
            text = coursePrice,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        // Display the "Pay" button
        Button(
            onClick = {
                // Handle payment logic here
            },
            //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text = "Pay", color = Color.White)
        }

        val context = LocalContext.current
        val videoView = remember { VideoView(context) }
        var isPlaying by remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Demo ", color = Color.Black)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp) // Adjust height as needed
        ) {
            AndroidView(
                factory = { videoView },
                modifier = Modifier.fillMaxSize(),
                update = {
                    it.setVideoPath("android.resource://${context.packageName}/${R.raw.sample_video}")
                    it.start()
                }
            )

        }
        androidx.compose.material.Button(
            onClick = {
                if (isPlaying) {
                    videoView.pause()
                } else {
                    videoView.start()
                }
                isPlaying = !isPlaying
            },
            //modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
        ) {
            androidx.compose.material.Text(text = if (isPlaying) "Pause" else "Play")
        }
    }}