package com.example.datastructures
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class Question(val text: String, val options: List<String>, val correctAnswer: Int)

@Composable
fun QuizScreen(
    questions: List<Question>,
    onEndClicked: () -> Unit // Callback for when the "End" button is clicked
) {
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (currentQuestionIndex < questions.size) {
                    val currentQuestion = questions[currentQuestionIndex]

                    Text(
                        text = currentQuestion.text,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    currentQuestion.options.forEachIndexed { index, option ->
                        OptionButton(
                            text = option,
                            onClick = {
                                if (index == currentQuestion.correctAnswer) {
                                    score++
                                }
                                currentQuestionIndex++
                            }
                        )
                    }
                } else {
                    Text(
                        text = "Quiz completed! Your score: $score/${questions.size}",
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                }
                // "End" button at the bottom of the screen
                Button(
                    onClick = onEndClicked,
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(text = "End")
                }
            }
        }
    )
}

@Composable
fun OptionButton(text: String, onClick: () -> Unit) {
    var selected by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .clickable {
                selected = true
                onClick()
            }
            .background(
                color = if (selected) Color.Gray else Color.LightGray,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(8.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun QuizApp(navController: NavController) {
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun Linked(navController: NavController)
{
    val questions = listOf(
        Question(
            text = "Q1. Let P be a singly linked list. Let Q be the pointer to an intermediate node x in the list. What is the worst-case time complexity of the best known algorithm to delete the node x from the list?",
            options = listOf("O(n)","O(n2)","O(logn)","O(1)"),
            correctAnswer = 3
        ),
        Question(
            text = "Q2. The concatenation of two lists can be performed in O(1) time. Which of the following variation of the linked list can be used?",
            options = listOf("a) Singly linked list", "b) Doubly linked list", "c) Circular doubly linked list","d) Array implementation of list"),
            correctAnswer = 2
        ),
        Question(
            text = "Q3 Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4. The following C function takes a single-linked list of integers as a parameter and rearranges the elements of the list. The function is called with the list containing the integers 1, 2, 3, 4, 5, 6, 7 in the given order. What will be the contents of the list after the function completes execution?\n" +
                    "struct node \n" +
                    "{\n" +
                    "    int value;\n" +
                    "    struct node *next;\n" +
                    "};\n" +
                    "void rearrange(struct node *list)\n" +
                    "{\n" +
                    "    struct node *p, * q;\n" +
                    "    int temp;\n" +
                    "    if ((!list) || !list->next) \n" +
                    "      return;\n" +
                    "    p = list;\n" +
                    "    q = list->next;\n" +
                    "    while(q) \n" +
                    "    {\n" +
                    "         temp = p->value;\n" +
                    "         p->value = q->value;\n" +
                    "         q->value = temp;\n" +
                    "         p = q->next;\n" +
                    "         q = p?p->next:0;\n" +
                    "    }\n" +
                    "}\n",
            options = listOf("a) 1, 2, 3, 4, 5, 6, 7", "b) 2, 1, 4, 3, 6, 5, 7", "c) 1, 3, 2, 5, 4, 7, 6","d) 2, 3, 4, 5, 6, 7, 1"),
            correctAnswer = 1
        ), Question(
            text = "Q5. Linked lists are not suitable for the implementation of ___________",
            options = listOf("a) Insertion sort", "b) Radix sort", "c) Polynomial manipulation", "d) Binary search"),
            correctAnswer = 3
        ),
        Question(
            text = "Q6. The reverse() function is supposed to reverse a singly linked list. One line is missing at the end of the function.\n" +
                    "/ * node * /\n" +
                    "\n" +
                    "struct node\n" +
                    "{ int data; struct node* next; } ;\n" +
                    " \n" +
                    "/ * head_refer is a double pointer that points to the head (or start) pointer \n" +
                    "  of linked list * /\n" +
                    "\n" +
                    "static void reverse( struct node** head_refer )\n" +
                    "{\n" +
                    "    struct node* prev  = NULL;\n" +
                    "    struct node* current = *head_refer;\n" +
                    "    struct node* next;\n" +
                    "    while ( current != NULL )\n" +
                    "    {\n" +
                    "        next = current->next; \n" +
                    "        current->next = prev;  \n" +
                    "        prev = current;\n" +
                    "        current = next;\n" +
                    "    }\n" +
                    "    /*ADD A STATEMENT HERE*/\n" +
                    "}\n" +
                    "\n" +
                    "What should be a statement so that they function correctly reverses a linked list?\n",
            options = listOf("a)\t*head_refer = prev;", "b)\t*head_refer = current;", "c)\t*head_refer = next;", "d)\t*head_refer = NULL;"),
            correctAnswer = 0
        )
        , Question(
            text = "Q7. Given pointer to a node X in a singly linked list. Only one pointer is given, pointer to head node is not given, can we delete the node X from given linked list?",
            options = listOf("a) Possible if X is not last node", "b) Possible if size of linked list is even", "c) Possible if size of linked list is odd", "d) Possible if X is not first node"),
            correctAnswer = 3
        ),Question(
            text = "Q8. Consider an implementation of unsorted singly linked list. Suppose it has its representation with a head pointer only. Given the representation, which of the following operation can be implemented in O(1) time?",
            options = listOf("i) Insertion at the front of the linked list","ii) Insertion at the end of the linked list","iii) Deletion of the front node of the linked list","iv) Deletion of the last node of the linked list"),
            correctAnswer = 1
        )
        ,Question(
            text = "Q9. The concatenation of two lists can be performed in O(1) time. Which of the following variation of the linked list can be used?",
            options = listOf("a) Singly linked list","b) Doubly linked list","c) Circular doubly linked list","d) Array implementation of list"),
            correctAnswer = 2
        ),
        Question(
            text = "Q10. Consider the following definition in c programming language."+"\n"+"struct node\n" +
                    "{\n" +
                    "    int data;\n" +
                    "    struct node * next;\n" +
                    "}\n" +
                    "typedef struct node NODE;\n" +
                    "NODE *ptr;\n" +
                    "Which of the following c code is used to create new node?\n",
            options = listOf("a) ptr = (NODE*)malloc(sizeof(NODE));","b) ptr = (NODE*)malloc(NODE);","c) ptr = (NODE*)malloc(sizeof(NODE*));","d) ptr = (NODE)malloc(sizeof(NODE));"),
            correctAnswer = 0
        ),
        Question(
            text = "Q11. The following C function takes a simply-linked list as an input argument. It modifies the list by moving the last element to the front of the list and returns the modified list. Some part of the code is left blank. Choose the correct alternative to replace the blank line.\n" +
                    "typedef struct node \n" +
                    "{\n" +
                    "    int value;\n" +
                    "    struct node *next;\n" +
                    "}Node;\n" +
                    " \n" +
                    "Node *move_to_front(Node *head) \n" +
                    "{\n" +
                    "    Node *p, *q;\n" +
                    "    if ((head == NULL: || (head->next == NULL)) \n" +
                    "    return head;\n" +
                    "    q = NULL; p = head;\n" +
                    "    while (p-> next !=NULL) \n" +
                    "    {\n" +
                    "        q = p;\n" +
                    "        p = p->next;\n" +
                    "    }\n" +
                    "   _______________________________\n" +
                    "  return head;\n" +
                    "}\n",
            options = listOf("a) q = NULL; p->next = head; head = p;","b) q->next = NULL; head = p; p->next = head;","c) head = p; p->next = q; q->next = NULL;","d) q->next = NULL; p->next = head; head = p;"),
            correctAnswer = 0
        )

    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }

}
@Composable
fun graph(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun stack(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun hashi(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun sorting(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun heaps(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
@Composable
fun Trees(navController: NavController)
{
    val questions = listOf(
        Question(
            text = ". What is the time complexity of inserting at the end in dynamic arrays?",
            options = listOf("O(1)","O(n)","O(logn)","Either O(1) or O(n)"),
            correctAnswer = 3
        ),
        Question(
            text = ". #include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                    "    int *ptr1 = arr;\n" +
                    "    int *ptr2 = arr + 5;\n" +
                    "    printf(\"Number of elements between two pointer are: %d.\", (ptr2 - ptr1));\n" +
                    "    printf(\"Number of bytes between two pointers are: %d\", (char*)ptr2 - (char*) ptr1);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "Assume that an int variable takes 4 bytes and a char variable takes 1 byte\n",
            options = listOf(") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 20\n", "Number of elements between two pointer are: 20.\n" +
                    "Number of bytes between two pointers are: 20\n", ") Number of elements between two pointer are: 5.\n" +
                    "Number of bytes between two pointers are: 5\n", "Compiler Error"),
            correctAnswer = 0
        ),
        Question(
            text = "Assume the following C variable declaration\n" +
                    "int * A[10], B[10][10];\n" +
                    "Of the following expressions\n",
            options = listOf("a)\tI, II, and IV only", "b)\tII, III, and IV only", "c)\tII and IV only", "d)\tIV only"),
            correctAnswer = 0
        ),
        Question(
            text = "Q4.Consider the following three C functions :\n" +
                    "\n" +
                    "[P1] int * g (void) \n" +
                    "{ \n" +
                    "  int x= 10; \n" +
                    "  return (&x); \n" +
                    "}  \n" +
                    "    \n" +
                    "[P2] int * g (void) \n" +
                    "{ \n" +
                    "  int * px; \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "} \n" +
                    "    \n" +
                    "[P3] int *g (void) \n" +
                    "{ \n" +
                    "  int *px; \n" +
                    "  px = (int *) malloc (sizeof(int)); \n" +
                    "  *px= 10; \n" +
                    "  return px; \n" +
                    "}\n" +
                    "Which of the above three functions are likely to cause problems with pointers? (GATE 2001)\n",
            options = listOf("(A) Only P3", "(B) Only P1 and P3y", "(C) Only P1 and P2", "(D) P1, P2 and P3"),
            correctAnswer = 2
        ), Question(
            text = "Q5. What is the time complexity of the following code:\n" +
                    "int i, j, k = 0;\n" +
                    "for (i = n / 2; i <= n; i++) {\n" +
                    "    for (j = 2; j <= n; j = j * 2) {\n" +
                    "        k = k + n / 2;\n" +
                    "    }\n" +
                    "}\n" +
                    "\n",
            options = listOf("a) O(N)", "b)\tO(Nlog N)", "c)\tO(N2)", "d)\tO(log N)"),
            correctAnswer = 1
        )
    )

    var quizCompleted by remember { mutableStateOf(false) }

    if (quizCompleted) {
        Button(
            onClick = {
                // Reset quiz
                quizCompleted = false
            }
        ) {
            Text(text = "Start Again")
        }
    } else {
        QuizScreen(
            questions = questions,
            onEndClicked = {
                quizCompleted = true
                navController.navigate("Home")
            }
        )
    }
}
