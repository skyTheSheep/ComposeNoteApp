package com.skyyeoh.composenoteapp.data

import com.skyyeoh.composenoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "After I resign", description = "First thing is to buy a piano keyboard and an online piano class"),
            Note(title = "Writing is my thing", description = "I starts to write my first novel"),
            Note(title = "One month later", description = "plan to go to Japan in July"),
            Note(title = "In July", description = "beautiful Osaka and Kyoto in Summer time"),
            Note(title = "Another Plan after that", description = "I went to Phu Soi Dao with my friend"),
            Note(title = "And then after the Mountain Climb", description = "I went to Om Koi Village in Chiang Mai"),
            Note(title = "It's not over", description = "The biggest Plan of this year is go to Turkey"),
            Note(title = "After the Wonderful time", description = "I have to go to take care of my dad for like almost 2 weeks in Ipoh, Malaysia"),
            Note(title = "Before I'm back from Ipoh", description = "I went to Taiping and Penang"),
            Note(title = "it's not over", description = "I also went to Hong Kong with my Boyfriend too"),
            Note(title = "Future Plan", description = "I will go back to Betong, my hometown, to visit my mom and plan to see my father again")
        )
    }
}