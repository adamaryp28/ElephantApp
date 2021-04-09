package com.example.elephantapp.retrofit

import com.example.elephantapp.model.elephant
import com.example.elephantapp.utils.EntityMapper

import javax.inject.Inject

class NetworkMapper
    @Inject
    constructor(): EntityMapper<elephantNetworkEntity, elephant> {
        override fun mapFromEntity(entity: elephantNetworkEntity): elephant {
            return elephant(
                id = entity.id,
                index = entity.index,
                nombre = entity.nombre,
                afiliacion = entity.afiliacion,
                especie = entity.especie,
                sexo = entity.especie,
                ficticio = entity.ficticio,
                dob = entity.dob,
                dod = entity.dod,
                wiki = entity.wiki,
                url = entity.url,
                nota = entity.nota,
                height = entity.height,
                width = entity.width
            )
        }

        override fun mapToEntity(domainModel: elephant): elephantNetworkEntity{
            return elephantNetworkEntity(
                id = domainModel.id,
                index = domainModel.index,
                nombre = domainModel.nombre,
                afiliacion = domainModel.afiliacion,
                especie = domainModel.especie,
                sexo = domainModel.sexo,
                ficticio = domainModel.ficticio,
                dob = domainModel.dob,
                dod = domainModel.dod,
                wiki = domainModel.wiki,
                url = domainModel.url,
                nota = domainModel.nota,
                height = domainModel.height,
                width = domainModel.width
            )
        }

        fun mapFromEntityList(entities: List<elephantNetworkEntity>): List<elephant>{
            return entities.map { mapFromEntity(it)}
        }
}