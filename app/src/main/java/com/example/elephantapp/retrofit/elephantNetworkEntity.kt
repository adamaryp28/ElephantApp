package com.example.elephantapp.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class elephantNetworkEntity(
    @SerializedName("_id")
    @Expose
    var id: String,

    @SerializedName("index")
    @Expose
    var index: Int,

    @SerializedName("name")
    @Expose
    var nombre: String,

    @SerializedName("affiliation")
    @Expose
    var afiliacion: String,

    @SerializedName("species")
    @Expose
    var especie: String,

    @SerializedName("sex")
    @Expose
    var sexo: String,

    @SerializedName("fictional")
    @Expose
    var ficticio: String,

    @SerializedName("dob")
    @Expose
    var dob: String,

    @SerializedName("dod")
    @Expose
    var dod: String,

    @SerializedName("wikilink")
    @Expose
    var wiki: String,

    @SerializedName("image")
    @Expose
    var url: String,

    @SerializedName("note")
    @Expose
    var nota: String

)