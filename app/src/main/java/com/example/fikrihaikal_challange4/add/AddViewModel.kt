package com.example.fikrihaikal_challange4.add

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.fikrihaikal_challange4.data.NoteDatabase
import com.example.fikrihaikal_challange4.data.NoteEntity

import kotlinx.coroutines.launch

class AddViewModel(app: Application) : AndroidViewModel(app) {

    fun add(noteEntity: NoteEntity) = viewModelScope.launch {
        NoteDatabase.getInstance((getApplication()))!!.noteDao().insertNote(noteEntity)
    }
}