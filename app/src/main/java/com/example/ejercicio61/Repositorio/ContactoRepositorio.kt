package com.example.ejercicio61.Repositorio

import com.example.ejercicio61.Basedatos.Contacto
import com.example.ejercicio61.Basedatos.ContactoDAO
import kotlinx.coroutines.flow.Flow


import javax.inject.Inject

class ContactosRepositorio @Inject constructor(
    private val contactoDAO: ContactoDAO
) {
    fun getAllContacts() = contactoDAO.getAllContacts()

    fun getAnContactById(id: Long) = contactoDAO.getAnContactById(id)

    suspend fun addContact(contacto: Contacto) {
        contactoDAO.addContact(contacto)
    }

    suspend fun deleteContact(contacto: Contacto) {
        contactoDAO.deleteContact(contacto)
    }

    suspend fun updateContact(contacto: Contacto) {
        contactoDAO.updateContact(contacto)
    }
}
