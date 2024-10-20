package com.example.datastructures

import android.widget.VideoView

import androidx.compose.foundation.layout.*

import androidx.compose.runtime.*

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView


import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.sp

import androidx.navigation.NavController

@Composable
fun Array(navController: NavController)
{ Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Introduction to Arrays – Data Structure and Algorithm Tutorials\n?",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will discuss the array in data structure. Arrays are defined as the collection of similar types of data items stored at contiguous memory locations. It is one of the simplest data structures where each data element can be randomly accessed by using its index number.\n" +
                "\n" +
                "In C programming, they are the derived data types that can store the primitive type of data such as int, char, double, float, etc. For example, if we want to store the marks of a student in 6 subjects, then we don't need to define a different variable for the marks in different subjects. Instead, we can define an array that can store the marks in each subject at the contiguous memory locations"
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of an array", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "We can represent an array in various ways in different programming languages. As an illustration, let's see the declaration of array in C language -")
    Text(text = "there are some of the following important points -")
    Text(
        text = "* Index starts with 0.\n" +
                "* The array's length is 10, which means we can store 10 elements.\n" +
                "* Each element in the array can be accessed via its index."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why are arrays required?", fontSize = 20.sp, fontWeight = FontWeight.Bold,color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Arrays are useful because -\n" +
                "\n" +
                "* Sorting and searching a value in an array is easier.\n" +
                "* Arrays are best to process multiple values quickly and easily.\n" +
                "* Arrays are good for storing multiple values in a single variable - In computer programming, most cases require storing a large number of data of a similar type. To store such an amount of data, we need to define a large number of variables. It would be very difficult to remember the names of all the variables while writing the programs. Instead of naming all the variables with a different name, it is better to define an array and store all the elements into it."
    )
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Basic operations", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Traversal - This operation is used to print the elements of the array.\n" +
                "* Insertion - It is used to add an element at a particular index.\n" +
                "* Deletion - It is used to delete an element from a particular index.\n" +
                "* Search - It is used to search an element using the given index or by the value.\n" +
                "* Update - It updates an element at a particular index."
    )


}
}
}
@Composable
fun  Introduction(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    )
    {   Column(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Introduction to Data Structure",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Data Structures (DS) tutorial provides basic and advanced concepts of Data Structure. Our Data Structure tutorial is designed for beginners and professionals.\n" +
                    "\n" +
                    "Data Structure is a way to store and organize data so that it can be used efficiently.\n" +
                    "\n" +
                    "Our Data Structure tutorial includes all topics of Data Structure such as Array, Pointer, Structure, Linked List, Stack, Queue, Graph, Searching, Sorting, Programs, etc.")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "What is Data Structure?", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "The data structure name indicates itself that organizing the data in memory. There are many ways of organizing the data in the memory as we have already seen one of the data structures, i.e., array in C language. Array is a collection of memory elements in which data is stored sequentially, i.e., one after another. In other words, we can say that array stores the elements in a continuous manner. This organization of data is done with the help of an array of data structures. There are also other ways to organize the data in memory. Let's see the different types of data structures.")

        Text(
            text = "The data structure is not any programming language like C, C++, java, etc. It is a set of algorithms that we can use in any programming language to structure the data in the memory.\n" +
                    "\n" +
                    "To structure the data in memory, 'n' number of algorithms were proposed, and all these algorithms are known as Abstract data types. These abstract data types are the set of rules.")

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Types of Data Structures", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "There are two types of data structures:"+"\n"+"* Primitive data structure\n" +
                    "* Non-primitive data structure")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Primitive Data structure", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "The primitive data structures are primitive data types. The int, char, float, double, and pointer are the primitive data structures that can hold a single value.")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Non-Primitive Data structure", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "The non-primitive data structure is divided into two types:\n" +
                    "\n" +
                    "Linear data structure\n" +
                    "Non-linear data structure")}}
}
@Composable
fun LinkedList(navController: NavController)
{   Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")

    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp) // Adjust height as needed
    ) {
        AndroidView(
            factory = { videoView },
            modifier = Modifier.fillMaxSize(),
            update = {
                it.setVideoPath("android.resource://${context.packageName}/${R.raw.sample_video2}")
                it.start()
            }
        )

    }
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}


}
@Composable
fun Stack(navController: NavController)
{    Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "What is a Stack?",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle. Stack has one end, whereas the Queue has two ends (front and rear). It contains only one pointer top pointer pointing to the topmost element of the stack. Whenever an element is added in the stack, it is added on the top of the stack, and the element can be deleted only from the stack. In other words, a stack can be defined as a container in which insertion and deletion can be done from the one end known as the top of the stack.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Some key points related to stack", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "* It is called as stack because it behaves like a real-world stack, piles of books, etc.\n" +
            "* A Stack is an abstract data type with a pre-defined capacity, which means that it can store the elements of a limited size.\n" +
            "* It is a data structure that follows some order to insert and delete the elements, and that order can be LIFO or FILO.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Working of Stack", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text ="Stack works on the LIFO pattern. As we can observe in the below figure there are five memory blocks in the stack; therefore, the size of the stack is 5.\n" +
            "\n" +
            "Suppose we want to store the elements in a stack and let's assume that stack is empty. We have taken the stack of size 5 as shown below in which we are pushing the elements one by one until the stack becomes full.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Standard Stack Operations", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "The following are some common operations implemented on the stack:\n" +
                "\n" +
                "push(): When we insert an element in a stack then the operation is known as a push. If the stack is full then the overflow condition occurs.\n" +
                "pop(): When we delete an element from the stack, the operation is known as a pop. If the stack is empty means that no element exists in the stack, this state is known as an underflow state.\n" +
                "isEmpty(): It determines whether the stack is empty or not.\n" +
                "isFull(): It determines whether the stack is full or not.'\n" +
                "peek(): It returns the element at the given position.\n" +
                "count(): It returns the total number of elements available in a stack.\n" +
                "change(): It changes the element at the given position.\n" +
                "display(): It prints all the elements available in the stack.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "PUSH operation", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The steps involved in the PUSH operation is given below:\n" +
            "\n" +
            "* Before inserting an element in a stack, we check whether the stack is full.\n" +
            "* If we try to insert the element in a stack, and the stack is full, then the overflow condition occurs.\n" +
            "* When we initialize a stack, we set the value of top as -1 to check that the stack is empty.\n" +
            "* When the new element is pushed in a stack, first, the value of the top gets incremented, i.e., top=top+1, and the element will be placed at the new position of the top.\n" +
            "* The elements will be inserted until we reach the max size of the stack.\n")

    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "POP  operation", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "The steps involved in the POP operation is given below:\n" +
            "\n" +
            "* Before deleting the element from the stack, we check whether the stack is empty.\n" +
            "* If we try to delete the element from the empty stack, then the underflow condition occurs.\n" +
            "* If the stack is not empty, we first access the element which is pointed by the top\n" +
            "* Once the pop operation is performed, the top is decremented by 1, i.e., top=top-1.")

    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    }
    }

}
@Composable
fun Search(navController: NavController)
{    Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Sorting Algorithms",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Sorting is the process of arranging the elements of an array so that they can be placed either in ascending or descending order. For example, consider an array A = {A1, A2, A3, A4, ?? An }, the array is called to be in ascending order if element of A are arranged like A1 > A2 > A3 > A4 > A5 > ? > An .")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Consider an array;", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Consider an array;")
    Text(text = "int A[10] = { 5, 4, 10, 2, 30, 45, 34, 14, 18, 9 )")
    Text(
        text = "The Array sorted in ascending order will be given as;\n" +
                "\n" +
                "A[] = { 2, 4, 5, 9, 10, 14, 18, 30, 34, 45 }\n" +
                "\n" +
                "There are many techniques by using which, sorting can be performed. In this section of the tutorial, we will discuss each method in detail.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Sorting Algorithms", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Sorting algorithms are described in the following table along with the description.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Bubble Sort\tIt is the simplest sort method which performs sorting by repeatedly moving the largest element to the highest index of the array. It comprises of comparing each element to its adjacent element and replace them accordingly.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Bucket Sort\tBucket sort is also known as bin sort. It works by distributing the element into the array also called buckets. In this sorting algorithms, Buckets are sorted individually by using different sorting algorithm.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Heap Sort\tIn the heap sort, Min heap or max heap is maintained from the array elements deending upon the choice and the elements are sorted by deleting the root element of the heap.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Insertion Sort\tAs the name suggests, insertion sort inserts each element of the array to its proper place. It is a very simple sort method which is used to arrange the deck of cards while playing bridge.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Merge Sort\tMerge sort follows divide and conquer approach in which, the list is first divided into the sets of equal elements and then each half of the list is sorted by using merge sort. The sorted list is combined again to form an elementary sorted array.")
    Spacer(modifier = Modifier.height(16.dp))
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp) // Adjust height as needed
    ) {
        AndroidView(
            factory = { videoView },
            modifier = Modifier.fillMaxSize(),
            update = {
                it.setVideoPath("android.resource://${context.packageName}/${R.raw.sample_video2}")
                it.start()
            }
        )

    }
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Searching Algorithms", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Searching algorithms are methods or procedures used to find a specific item or element within a collection of data. These algorithms are widely used in computer science and are crucial for tasks like searching for a particular record in a database, finding an element in a sorted list, or locating a file on a computer.")}
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "These are some commonly used searching algorithms:\n" +
                "\n" +
                "**  Linear Search: In this simple algorithm, each element in the collection is sequentially checked until the desired item is found, or the entire list is traversed. It is suitable for small-sized or unsorted lists, but its time complexity is O(n) in the worst case.\n" +
                "**  Binary Search: This algorithm is applicable only to sorted lists. It repeatedly compares the middle element of the list with the target element and narrows down the search range by half based on the comparison result. Binary search has a time complexity of O(log n), making it highly efficient for large sorted lists.\n" +
                "**  Hashing: Hashing algorithms use a hash function to convert the search key into an index or address of an array (known as a hash table). This allows for constant-time retrieval of the desired item if the hash function is well-distributed and collisions are handled appropriately. Common hashing techniques include direct addressing, separate chaining, and open addressing.\n" +
                "**  Interpolation Search: Similar to binary search, interpolation search works on sorted lists. Instead of always dividing the search range in half, interpolation search uses the value of the target element and the values of the endpoints to estimate its approximate position within the list. This estimation helps in quickly narrowing down the search space. The time complexity of interpolation search is typically O(log log n) on average if the data is uniformly distributed.\n" +
                "**  Tree-based Searching: Various tree data structures, such as binary search trees (BST), AVL trees, or B-trees, can be used for efficient searching. These structures impose an ordering on the elements and provide fast search, insertion, and deletion operations. The time complexity of tree-based searching algorithms depends on the height of the tree and can range from O(log n) to O(n) in the worst case.\n" +
                "**  Ternary Search: Ternary search is an algorithm that operates on sorted lists and repeatedly divides the search range into three parts instead of two, based on two splitting points. It is a divide-and-conquer approach and has a time complexity of O(log₃ n).\n" +
                "**  Jump Search: Jump search is an algorithm for sorted lists that works by jumping ahead a fixed number of steps and then performing linear search in the reduced subarray. It is useful for large sorted arrays and has a time complexity of O(sqrt(n)), where n is the size of the array.\n" +
                "**  Exponential Search: Exponential search is a technique that combines elements of binary search and linear search. It begins with a small range and doubles the search range until the target element is within the range. It then performs a binary search within that range. Exponential search is advantageous when the target element is likely to be found near the beginning of the array and has a time complexity of O(log n).\n" +
                "**  Fibonacci Search: Fibonacci search is a searching algorithm that uses Fibonacci numbers to divide the search space. It works on sorted arrays and has a similar approach to binary search, but instead of dividing the array into halves, it divides it into two parts using Fibonacci numbers as indices. Fibonacci search has a time complexity of O(log n).\n" +
                "**  Interpolation Search for Trees: This algorithm is an extension of interpolation search designed for tree structures such as AVL trees or Red-Black trees. It combines interpolation search principles with tree traversal to efficiently locate elements in the tree based on their values. The time complexity depends on the tree structure and can range from O(log n) to O(n) in the worst case.\n" +
                "**  Hash-based Searching (e.g., Bloom Filter): Hash-based searching algorithms utilize hash functions and data structures like Bloom filters to determine whether an element is present in a set or not. These algorithms provide probabilistic answers, meaning they can occasionally have false positives (indicating an element is present when it is not), but no false negatives (if an element is not present, it will never claim it is). Bloom filters have a constant-time complexity for search operations.\n" +
                "**  String Searching Algorithms: Searching algorithms specific to string data include techniques like Knuth-Morris-Pratt (KMP) algorithm, Boyer-Moore algorithm, Rabin-Karp algorithm, and many others. These algorithms optimize the search for patterns within text or strings and are widely used in text processing, pattern matching, and string matching tasks.")}

}
@Composable
fun Tree(navController: NavController)
{    Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Tree Data Structure",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "We read the linear data structures like an array, linked list, stack and queue in which all the elements are arranged in a sequential manner. The different data structures are used for different kinds of data.")
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "Some factors are considered for choosing the data structure:\n" +
                "\n" +
                "\n" +
                "*  What type of data needs to be stored?: It might be a possibility that a certain data structure can be the best fit for some kind of data.\n" +
                "*  Cost of operations: If we want to minimize the cost for the operations for the most frequently performed operations. For example, we have a simple list on which we have to perform the search operation; then, we can create an array in which elements are stored in sorted order to perform the binary search. The binary search works very fast for the simple list as it divides the search space into half.\n" +
                "*  Memory usage: Sometimes, we want a data structure that utilizes less memory.\n" +
                "A tree is also one of the data structures that represent hierarchical data. Suppose we want to show the employees and their positions in the hierarchical form then it can be represented as shown below:")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Types of Tree data structure", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "General tree: The general tree is one of the types of tree data structure. In the general tree, a node can have either 0 or maximum n number of nodes. There is no restriction imposed on the degree of the node (the number of nodes that a node can contain). The topmost node in a general tree is known as a root node. The children of the parent node are known as subtrees.\n" +
            "Tree\n" +
            "There can be n number of subtrees in a general tree. In the general tree, the subtrees are unordered as the nodes in the subtree cannot be ordered.\n" +
            "Every non-empty tree has a downward edge, and these edges are connected to the nodes known as child nodes. The root node is labeled with level 0. The nodes that have the same parent are known as siblings.\n" +
            "Binary tree: Here, binary name itself suggests two numbers, i.e., 0 and 1. In a binary tree, each node in a tree can have utmost two child nodes. Here, utmost means whether the node has 0 nodes, 1 node or 2 nodes.\n" +
            "Tree\n" +
            "To know more about the binary tree, click on the link given below:\n" +
            "https://www.javatpoint.com/binary-tree\n" +
            "Binary Search tree: Binary search tree is a non-linear data structure in which one node is connected to n number of nodes. It is a node-based data structure. A node can be represented in a binary search tree with three fields, i.e., data part, left-child, and right-child. A node can be connected to the utmost two child nodes in a binary search tree, so the node contains two pointers (left child and right child pointer).\n" +
            "Every node in the left subtree must contain a value less than the value of the root node, and the value of each node in the right subtree must be bigger than the value of the root node.\n" +
            "A node can be created with the help of a user-defined data type known as struct, as shown below:\n" +
            "\n" +
            "struct node  \n" +
            "{  \n" +
            "    int data;  \n" +
            "    struct node *left;  \n" +
            "struct node *right;   \n" +
            "}  \n" +
            "The above is the node structure with three fields: data field, the second field is the left pointer of the node type, and the third field is the right pointer of the node type.\n" +
            "\n" +
            "To know more about the binary search tree, click on the link given below:\n" +
            "\n" +
            "https://www.javatpoint.com/binary-search-tree\n" +
            "\n" +
            "AVL tree\n" +
            "It is one of the types of the binary tree, or we can say that it is a variant of the binary search tree. AVL tree satisfies the property of the binary tree as well as of the binary search tree. It is a self-balancing binary search tree that was invented by Adelson Velsky Lindas. Here, self-balancing means that balancing the heights of left subtree and right subtree. This balancing is measured in terms of the balancing factor.\n" +

            "\n" +
            "\n" +
            "We can consider a tree as an AVL tree if the tree obeys the binary search tree as well as a balancing factor. The balancing factor can be defined as the difference between the height of the left subtree and the height of the right subtree. The balancing factor's value must be either 0, -1, or 1; therefore, each node in the AVL tree should have the value of the balancing factor either as 0, -1, or 1.\n" +
            "\n" +
            "To know more about the AVL tree, click on the link given below:\n" +


            "Red-Black Tree\n" +
            "The red-Black tree is the binary search tree. The prerequisite of the Red-Black tree is that we should know about the binary search tree. In a binary search tree, the value of the left-subtree should be less than the value of that node, and the value of the right-subtree should be greater than the value of that node. As we know that the time complexity of binary search in the average case is log2n, the best case is O(1), and the worst case is O(n).\n" +
            "\n" +
            "When any operation is performed on the tree, we want our tree to be balanced so that all the operations like searching, insertion, deletion, etc., take less time, and all these operations will have the time complexity of log2n.\n" +
            "\n" +
            "The red-black tree is a self-balancing binary search tree. AVL tree is also a height balancing binary search tree then why do we require a Red-Black tree. In the AVL tree, we do not know how many rotations would be required to balance the tree, but in the Red-black tree, a maximum of 2 rotations are required to balance the tree. It contains one extra bit that represents either the red or black color of a node to ensure the balancing of the tree.\n" +
            "\n" +
            "Splay tree\n" +
            "The splay tree data structure is also binary search tree in which recently accessed element is placed at the root position of tree by performing some rotation operations. Here, splaying means the recently accessed node. It is a self-balancing binary search tree having no explicit balance condition like AVL tree.\n" +
            "\n" +
            "It might be a possibility that height of the splay tree is not balanced, i.e., height of both left and right subtrees may differ, but the operations in splay tree takes order of logN time where n is the number of nodes.\n" +
            "\n" +
            "Splay tree is a balanced tree but it cannot be considered as a height balanced tree because after each operation, rotation is performed which leads to a balanced tree.\n" +
            "\n" +
            "Treap\n" +
            "Treap data structure came from the Tree and Heap data structure. So, it comprises the properties of both Tree and Heap data structures. In Binary search tree, each node on the left subtree must be equal or less than the value of the root node and each node on the right subtree must be equal or greater than the value of the root node. In heap data structure, both right and left subtrees contain larger keys than the root; therefore, we can say that the root node contains the lowest value.\n" +
            "\n" +
            "In treap data structure, each node has both key and priority where key is derived from the Binary search tree and priority is derived from the heap data structure.\n" +
            "\n" +
            "The Treap data structure follows two properties which are given below:\n" +
            "\n" +
            "Right child of a node>=current node and left child of a node <=current node (binary tree)\n" +
            "Children of any subtree must be greater than the node (heap)\n" +
            "B-tree\n" +
            "B-tree is a balanced m-way tree where m defines the order of the tree. Till now, we read that the node contains only one key but b-tree can have more than one key, and more than 2 children. It always maintains the sorted data. In binary tree, it is possible that leaf nodes can be at different levels, but in b-tree, all the leaf nodes must be at the same level.\n" +
            "\n" +
            "If order is m then node has the following properties:\n" +
            "\n" +
            "Each node in a b-tree can have maximum m children\n" +
            "For minimum children, a leaf node has 0 children, root node has minimum 2 children and internal node has minimum ceiling of m/2 children. For example, the value of m is 5 which means that a node can have 5 children and internal nodes can contain maximum 3 children.\n" +
            "Each node has maximum (m-1) keys.\n" +
            "The root node must contain minimum 1 key and all other nodes must contain atleast ceiling of m/2 minus 1 keys.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
}

}
}
@Composable
fun Graph(navController: NavController)
{   Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}


}
@Composable
fun Queue(navController: NavController)
{    Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}

}
@Composable
fun heap(navController: NavController)
{   Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}

}
@Composable
fun Structure(navController: NavController)
{   Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}

}
@Composable
fun hash(navController: NavController)
{    Column(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
)
{   Column(
    modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
    Text(
        text = "Linked list",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "In this article, we will see the introduction of linked list.\n" +
                "\n" +
                "Linked list is a linear data structure that includes a series of connected nodes. Linked list can be defined as the nodes that are randomly stored in the memory. A node in the linked list contains two parts, i.e., first is the data part and second is the address part. The last node of the list contains a pointer to the null. After array, linked list is the second most used data structure. In a linked list, every link contains a connection to another link.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Properties of array", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "There are some of the properties of an array that are listed as follows -")
    Text(
        text = "* Each element in an array is of the same data type and carries the same size that is 4 bytes.\n" +
                "* Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.\n" +
                "* Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element."
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Representation of a Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Linked list can be represented as the connection of nodes in which each node points to the next node of the list.")
    Text(text = "Till now, we have been using array data structure to organize the group of elements that are to be stored individually in the memory. However, Array has several advantages and disadvantages that must be known to decide the data structure that will be used throughout the program.")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "Why use linked list over array?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is a data structure that overcomes the limitations of arrays. Let's first see some of the limitations of arrays -\n" +
                "\n" +
                "The size of the array must be known in advance before using it in the program.\n" +
                "Increasing the size of the array is a time taking process. It is almost impossible to expand the size of the array at run time.\n" +
                "All the elements in the array need to be contiguously stored in the memory. Inserting an element in the array needs shifting of all its predecessors.\n")
    Text(text = "Linked list is useful because -\n" +
            "\n" +
            "It allocates the memory dynamically. All the nodes of the linked list are non-contiguously stored in the memory and linked together with the help of pointers.\n" +
            "In linked list, size is no longer a problem since we do not need to define its size at the time of declaration. List grows as per the program's demand and limited to the available memory space.")
    val context = LocalContext.current
    val videoView = remember { VideoView(context) }
    var isPlaying by remember { mutableStateOf(false) }

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
    Button(
        onClick = {
            if (isPlaying) {
                videoView.pause()
            } else {
                videoView.start()
            }
            isPlaying = !isPlaying
        },
        modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button horizontally
    ) {
        Text(text = if (isPlaying) "Pause" else "Play")
    }
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "How to declare a linked list?", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "It is simple to declare an array, as it is of single type, while the declaration of linked list is a bit more typical than array. Linked list contains two parts, and both are of different types, i.e., one is the simple variable, while another is the pointer variable. We can declare the linked list by using the user-defined data type structure.")
}
    Text(text = "Types of Linked list", fontSize = 20.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = "Linked list is classified into the following types -\n" +
                "\n" +
                "* Singly-linked list - Singly linked list can be defined as the collection of an ordered set of elements. A node in the singly linked list consists of two parts: data part and link part. Data part of the node stores actual information that is to be represented by the node, while the link part of the node stores the address of its immediate successor.\n" +
                "* Doubly linked list - Doubly linked list is a complex type of linked list in which a node contains a pointer to the previous as well as the next node in the sequence. Therefore, in a doubly-linked list, a node consists of three parts: node data, pointer to the next node in sequence (next pointer), and pointer to the previous node (previous pointer).\n" +
                "* Circular singly linked list - In a circular singly linked list, the last node of the list contains a pointer to the first node of the list. We can have circular singly linked list as well as circular doubly linked list.\n" +
                "* Circular doubly linked list - Circular doubly linked list is a more complex type of data structure in which a node contains pointers to its previous node as well as the next node. Circular doubly linked list doesn't contain NULL in any of the nodes. The last node of the list contains the address of the first node of the list. The first node of the list also contains the address of the last node in its previous pointer.")
}

}