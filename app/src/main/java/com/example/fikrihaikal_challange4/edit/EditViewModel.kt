package com.example.fikrihaikal_challange4.edit

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fikrihaikal_challange4.data.NoteDatabase
import com.example.fikrihaikal_challange4.data.NoteEntity

import kotlinx.coroutines.launch

class EditViewModel(app: Application) : AndroidViewModel(app) {
    fun edit(noteEntity: NoteEntity) = viewModelScope.launch {
        NoteDatabase.getInstance((getApplication()))!!.noteDao().updateNote(noteEntity)
    }
}