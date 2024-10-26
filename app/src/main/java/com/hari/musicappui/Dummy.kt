package com.hari.musicappui

import androidx.annotation.DrawableRes

data class Lib(
    @DrawableRes val icon: Int, val name: String
) {

}

val libraries = listOf<Lib>(
    Lib(icon = R.drawable.ic_baseline_album_24, name = "Albums"),
    Lib(icon= R.drawable.ic_baseline_music_note_24, name = "Favourites"),
    Lib(icon = R.drawable.ic_genre, name = "Genre"),
    Lib(icon = R.drawable.ic_playlist_green, name = "PlayList"),
    Lib(icon = R.drawable.ic_microphone, name="Podcast")
    )

