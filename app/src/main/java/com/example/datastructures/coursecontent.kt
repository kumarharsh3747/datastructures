package com.example.datastructures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TopicCard(title: String, description: String) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        // elevation = CardDefaults.elevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(8.dp))
            BasicText(text = description)
        }
    }
}
@Composable
fun OSInformation(navController: NavController) {
    TopicCard(
        title = "Operating Systems (OS)",
        description = """
            - System calls for managing hardware and resources.
            - Process management: scheduling and handling of processes.
            - File system operations: organizing and managing storage.
            - Inter-process communication: shared memory, message queues.
            - Memory management: virtual memory, memory allocation.
            - OS types: Windows, Linux, macOS, and real-time operating systems.
        """.trimIndent()
    )
}

@Composable
fun JavaInformation(navController: NavController) {
    TopicCard(
        title = "Java",
        description = """
            - Object-oriented programming language.
            - JVM: platform-independent bytecode execution.
            - Strongly typed with rich standard libraries.
            - Popular for enterprise applications and Android development.
            - Modern features: lambdas, streams, and functional programming.
            - Multithreading and concurrency support.
            - Large community and extensive documentation.
        """.trimIndent()
    )
}

@Composable
fun CPlusPlusInformation(navController: NavController) {
    TopicCard(
        title = "C++",
        description = """
            - Object-oriented language with low-level features.
            - Extends C with classes, templates, and exceptions.
            - Used in game development, simulations, and system software.
            - Supports direct memory access with pointers.
            - Standard Template Library (STL) for data structures and algorithms.
            - Rich ecosystem of libraries and frameworks.
            - Known for performance optimization and memory management.
        """.trimIndent()
    )
}

@Composable
fun PythonInformation(navController: NavController) {
    TopicCard(
        title = "Python",
        description = """
            - High-level, dynamic language with easy-to-read syntax.
            - Popular for data science, machine learning, and web development.
            - Extensive standard library and community support.
            - Supports multiple programming paradigms: procedural, object-oriented, and functional.
            - Libraries: NumPy, Pandas, SciPy, and TensorFlow.
            - Cross-platform compatibility and interpreter-based execution.
        """.trimIndent()
    )
}

@Composable
fun CInformation(navController: NavController) {
    TopicCard(
        title = "C",
        description = """
            - Low-level language with close interaction with hardware.
            - Foundation for many other languages (e.g., C++, Java, and Objective-C).
            - Used in system programming, embedded systems, and OS development.
            - Strong memory management and manual memory handling.
            - Pointers and direct access to memory addresses.
            - Known for performance and efficiency.
        """.trimIndent()
    )
}

@Composable
fun MLInformation(navController: NavController) {
    TopicCard(
        title = "Machine Learning",
        description = """
            - Uses algorithms to enable predictions and classifications.
            - Commonly implemented with Python libraries such as Scikit-learn and TensorFlow.
            - Involves data preprocessing, feature engineering, and model evaluation.
            - Applications include image recognition, natural language processing, and AI.
            - Supervised, unsupervised, and reinforcement learning.
            - Requires understanding of statistics and data analysis.
        """.trimIndent()
    )
}

@Composable
fun DBMSInformation(navController: NavController) {
    TopicCard(
        title = "Database Management Systems (DBMS)",
        description = """
            - Software for storing, organizing, and retrieving data.
            - Types: relational (e.g., MySQL, PostgreSQL) and NoSQL databases (e.g., MongoDB).
            - Supports data integrity and security features.
            - Stored procedures, triggers, and views for data manipulation.
            - Database normalization and query optimization.
            - Database design and data modeling principles.
        """.trimIndent()
    )
}

@Composable
fun WebDevelopmentInformation(navController: NavController) {
    TopicCard(
        title = "Web Development",
        description = """
            - Involves building web applications and services.
            - Frontend technologies: HTML, CSS, and JavaScript.
            - Backend technologies: server-side languages and frameworks (e.g., Flask, Django, and Spring Boot).
            - Common backend languages: Python, Java, Node.js, and PHP.
            - RESTful APIs and microservices architecture.
            - Responsive web design and user experience (UX) principles.
            - Modern frameworks: React, Vue, and Angular for frontend development.
        """.trimIndent()
    )
}

@Composable
fun AppDevelopmentInformation(navController: NavController) {
    TopicCard(
        title = "App Development",
        description = """
            - Building software applications for mobile and desktop platforms.
            - Includes Android and iOS development.
            - Popular languages: Kotlin, Java, Swift, and C#.
            - Jetpack Compose: modern UI toolkit for Android app development.
            - User interfaces with intuitive design patterns.
            - Platform-specific APIs and services (e.g., location, notifications).
            - Hybrid development using Flutter and React Native for cross-platform apps.
        """.trimIndent()
    )
}