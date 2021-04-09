package com.example.elephantapp.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class elephantNetworkEntity(
    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("index")
    @Expose
    var index: Int,

    @SerializedName("nombre")
    @Expose
    var nombre: String,

    @SerializedName("afiliacion")
    @Expose
    var afiliacion: String,

    @SerializedName("especie")
    @Expose
    var especie: String,

    @SerializedName("sexo")
    @Expose
    var sexo: String,

    @SerializedName("ficticio")
    @Expose
    var ficticio: String,

    @SerializedName("dob")
    @Expose
    var dob: String,

    @SerializedName("dod")
    @Expose
    var dod: String,

    @SerializedName("wiki")
    @Expose
    var wiki: String,

    @SerializedName("url")
    @Expose
    var url: String,

    @SerializedName("nota")
    @Expose
    var nota: String,

    @SerializedName("width")
    @Expose
    var width: Int,

    @SerializedName("height")
    @Expose
    var height: Int
)