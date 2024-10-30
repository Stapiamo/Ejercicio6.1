package com.example.ejercicio61.Basedatos

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.ejercicio61.Room.DateConverter

@Database(entities = [Contacto::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class ContactosDB : RoomDatabase() {
    abstract fun contactoDAO(): ContactoDAO
}