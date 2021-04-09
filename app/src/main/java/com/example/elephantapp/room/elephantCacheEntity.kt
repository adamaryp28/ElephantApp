package com.example.elephantapp.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "elefante")
class elephantCacheEntity (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: String,
    @ColumnInfo(name = "index")
    var index: Int,
    @ColumnInfo(name = "nombre")
    var nombre: String,
    @ColumnInfo(name = "afiliacion")
    var afiliacion: String,
    @ColumnInfo(name = "especie")
    var especie: String,
    @ColumnInfo(name = "sexo")
    var sexo: String,
    @ColumnInfo(name = "ficticio")
    var ficticio: String,
    @ColumnInfo(name = "dob")
    var dob: String,
    @ColumnInfo(name = "dod")
    var dod: String,
    @ColumnInfo(name = "wiki")
    var wiki: String,
    @ColumnInfo(name = "url")
    var url: String,
    @ColumnInfo(name = "nota")
    var nota: String,
    @ColumnInfo(name = "width")
    var width: Int,
    @ColumnInfo(name = "height")
    var height: Int
)