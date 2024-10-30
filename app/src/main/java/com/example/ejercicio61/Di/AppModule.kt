package com.example.ejercicio61.Di

import android.content.Context
import androidx.room.Room
import com.example.ejercicio61.Basedatos.ContactoDAO
import com.example.ejercicio61.Basedatos.ContactosDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun proveerContactoDAO(contactosDB: ContactosDB): ContactoDAO {
        return contactosDB.contactoDAO()
    }

    @Suppress("UNREACHABLE_CODE")
    @Provides
    @Singleton

    fun proveerContactosDB(@ApplicationContext context: Context): ContactosDB {
        return Room.databaseBuilder(
            context,
            ContactosDB::class.java,
            "ContactosDB"
        )
            .fallbackToDestructiveMigration()
            .build()

    }
}