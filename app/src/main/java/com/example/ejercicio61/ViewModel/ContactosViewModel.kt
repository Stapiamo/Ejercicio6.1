package com.example.ejercicio61.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejercicio61.Basedatos.Contacto
import com.example.ejercicio61.Repositorio.ContactosRepositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ContactosViewModel @Inject constructor(
    private val repositorio: ContactosRepositorio
) : ViewModel() {

    val contacto:Flow<List<Contacto>> = repositorio.getAllContacts()


    // Función para agregar un nuevo contacto
    fun getAnContactById(id: Long): Flow<Contacto> {
        return repositorio.getAnContactById(id)
    }

    fun addContact(contacto: Contacto) {
    viewModelScope.launch {
        repositorio.addContact(contacto)
        }
    }

    fun deleteContact(contacto: Contacto) {
        viewModelScope.launch {
            repositorio.deleteContact(contacto)
        }
    }

    fun updateContact(contacto: Contacto) {
        viewModelScope.launch {
            repositorio.updateContact(contacto)
        }
    }
}