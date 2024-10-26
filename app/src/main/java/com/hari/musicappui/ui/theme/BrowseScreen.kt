package com.hari.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hari.musicappui.R

@Composable
fun BrowseScreen() {
    val categories = listOf("Hits", "Happy", "Workout", "Party", "Yoga", "TGIF")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly,

    ) {
        items(categories) {

            item ->
                BrowserItem(item, R.drawable.baseline_apps_24)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BrowseScreenPreview() {
    BrowseScreen()
}