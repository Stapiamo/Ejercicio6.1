package com.example.ejercicio61.Basedatos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface ContactoDAO {

    @Insert
    suspend fun addContact(contacto: Contacto)

    @Update
    suspend fun updateContact(contacto: Contacto)

    @Delete
    suspend fun deleteContact(contacto: Contacto)

    @Query("SELECT * FROM contacto")
    fun getAllContacts(): Flow<List<Contacto>>

    @Query("SELECT * FROM contacto WHERE id = :id")
    fun getAnContactById(id: Long): Flow<Contacto>

}