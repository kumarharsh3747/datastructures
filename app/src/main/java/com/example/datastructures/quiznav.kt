package com.example.datastructures

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun JetpackPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Array",fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Button(
                    onClick = { navController.navigate("quiznav") },
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text = "Array Quiz")
                }

            }



            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Stack",fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Button(
                    onClick = { navController.navigate("stack") },
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="Stack Quiz")
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Linked list")
                Button(
                    onClick = { navController.navigate("Linked") },
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="Linkedlist Quiz")
                }
            }



            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Graph")
                Button(
                    onClick = { navController.navigate("graph") },
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="Graph Quiz")
                }
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Hash Quiz")
                Button(
                    onClick = { navController.navigate("hash")},
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="Hash Quiz")
                }
            }



            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Graph")
                Button(
                    onClick = { navController.navigate("sorting") },
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="search and sorting Quiz")
                }
            }}
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Linked list")
                Button(
                    onClick = { navController.navigate("Trees") },
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="Tree Quiz")
                }
            }



            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
                    .background(Color.White, RoundedCornerShape(8.dp))
                    .border(BorderStroke(1.dp, Color.Black))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text="Graph")
                Button(
                    onClick = { navController.navigate("heaps") },
                    modifier = Modifier

                        .padding(4.dp)
                        .background(Color.White, RoundedCornerShape(8.dp))
                        .border(BorderStroke(1.dp, Color.Black))
                        .padding(16.dp)
                ) {
                    Text(text="heap Quiz")
                }
            }}

    }
}

/*@Composable
fun PairBox(text: String, buttonText: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(4.dp)
                .background(Color.White, RoundedCornerShape(8.dp))
                .border(BorderStroke(1.dp, Color.Black))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text)
        }

        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .weight(1f)
                .padding(4.dp)
                .background(Color.White, RoundedCornerShape(8.dp))
                .border(BorderStroke(1.dp, Color.Black))
                .padding(16.dp)
        ) {
            Text(buttonText)
        }
    }
}
*/