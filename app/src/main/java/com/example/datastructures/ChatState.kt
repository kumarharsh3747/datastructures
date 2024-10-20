package com.example.datastructures

import android.graphics.Bitmap
import com.example.datastructures.data.Chat

/**
 * @author Ahmed Guedmioui
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)