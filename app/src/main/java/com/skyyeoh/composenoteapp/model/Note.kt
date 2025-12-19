package com.skyyeoh.composenoteapp.model

import java.time.LocalDateTime
import java.util.UUID

data class Note(
    val id: UUID = UUID.randomUUID(), // it's gonna show random id
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
)
