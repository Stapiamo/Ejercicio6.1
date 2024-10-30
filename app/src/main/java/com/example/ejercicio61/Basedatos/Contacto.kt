package com.example.ejercicio61.Basedatos

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "contacto")
data class Contacto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val telefono: String,
    val correo: String,
    val imagenPerfil: String? = null,
    val fechaNacimiento: String
)