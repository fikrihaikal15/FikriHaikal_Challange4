package com.example.fikrihaikal_challange4.delete

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fikrihaikal_challange4.data.NoteDatabase
import com.example.fikrihaikal_challange4.data.NoteEntity

import kotlinx.coroutines.launch

class DeleteViewModel(app: Application) : AndroidViewModel(app) {
    fun delete(noteEntity: NoteEntity) = viewModelScope.launch {
        NoteDatabase.getInstance((getApplication()))!!.noteDao().deleteNote(noteEntity)
    }
}