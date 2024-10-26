package com.hari.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hari.musicappui.R

@Composable
fun AccountView() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row() {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account", modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("HariKrishna")
                    Text("@harikrishna")
                }
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "RightArrow")

            }
        }

        Row(modifier = Modifier.padding(top = 16.dp)) {
           Icon(
              painter = painterResource(id = R.drawable.baseline_music_video_24),
               contentDescription = "My Music",
               modifier = Modifier.padding(end = 8.dp)
           )

            Text("My Music")
        }
        Divider()

    }
}