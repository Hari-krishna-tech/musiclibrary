package com.hari.musicappui.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hari.musicappui.Lib
import com.hari.musicappui.R
import com.hari.musicappui.libraries

@Composable
fun Library(){

    LazyColumn {
        items(libraries) { lib ->
            LibItem(lib)
        }
    }
}


@Composable
fun LibItem(lib: Lib) {
    Row(modifier = Modifier.padding(16.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
        ) {
        Row(
            modifier = Modifier.padding(8.dp),
        ) {
            Icon(painter = painterResource(id = lib.icon), contentDescription = "icon",
                modifier = Modifier.padding(8.dp))
            Text(text = lib.name, modifier = Modifier.padding(8.dp))
        }

        Icon(
            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = "See all plans "
        )
    }
    Divider(modifier = Modifier.padding(horizontal = 8.dp))
}

@Preview(showBackground = true)
@Composable
fun LibraryPreview() {
    Library()
}