package com.example.myfirstapplication9.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Table_contact")
class ContactData (
    @PrimaryKey(autoGenerate = true)
    var contactId: Int,
    @ColumnInfo(name = "name",defaultValue = "Unknown")
    var name:String
)