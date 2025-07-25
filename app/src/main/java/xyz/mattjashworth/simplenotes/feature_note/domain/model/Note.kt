package xyz.mattjashworth.simplenotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.mattjashworth.simplenotes.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(Flesh, LightGreen, TealBlue, Purple, RedPink, Custom)
    }
}

class InvalidNoteException(message: String): Exception(message)