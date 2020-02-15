package com.codesroots.mac.cards.db

import androidx.room.Insert
import androidx.room.Query

interface CardDao {
    @Insert
    suspend fun  AddCard (carddb: CardDB)

    @Query ("SELECT * FROM carddb ORDER BY id DESC")
    suspend fun getAllNotes() : List<CardDB>
}