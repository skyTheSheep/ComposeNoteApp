package com.skyyeoh.composenoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skyyeoh.composenoteapp.data.NotesDataSource
import com.skyyeoh.composenoteapp.model.Note
import com.skyyeoh.composenoteapp.screen.NoteScreen
import com.skyyeoh.composenoteapp.screen.NoteViewModel
import com.skyyeoh.composenoteapp.ui.theme.ComposeNoteAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeNoteAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    // val noteViewModel = viewModel<NoteViewModel>() also works!!
                    val noteViewModel: NoteViewModel by viewModels()
                    NotesApp(noteViewModel)
                }
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//
//                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel = viewModel()) {
    val noteList = noteViewModel.noteList.collectAsState().value
    NoteScreen(notes = noteList,
        onAddNote = {
            noteViewModel.addNote(it)
        },
        onRemoveNote = {
            noteViewModel.removeNote(it)
        })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeNoteAppTheme {

    }
}