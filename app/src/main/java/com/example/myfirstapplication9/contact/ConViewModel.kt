package com.example.myfirstapplication9.contact

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.myfirstapplication9.data.ConDatabaseDao

class ConViewModel(val database: ConDatabaseDao, application: Application) :
    AndroidViewModel(application){
}