package com.example.ejercicio61

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.ejercicio61.ViewModel.ContactosViewModel
import com.example.ejercicio61.ui.theme.Ejercicio61Theme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val contactosViewModel: ContactosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio61Theme {

            }
        }
    }
}
