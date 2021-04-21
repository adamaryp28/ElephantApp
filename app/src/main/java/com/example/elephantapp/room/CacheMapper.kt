package com.example.elephantapp.room

import com.example.elephantapp.model.elephant
import com.example.elephantapp.utils.EntityMapper
import javax.inject.Inject

class CacheMapper
    @Inject
    constructor():
    EntityMapper<elephantCacheEntity, elephant> {
        override fun mapFromEntity(entity:elephantCacheEntity): elephant {
            return elephant(
                id = entity.id,
                index = entity.index,
                nombre = entity.nombre,
                afiliacion = entity.afiliacion,
                especie = entity.especie,
                sexo = entity.sexo,
                ficticio = entity.ficticio,
                dob = entity.dob,
                dod = entity.dod,
                wiki = entity.wiki,
                url = entity.url,
                nota = entity.nota
            )
        }

        override fun mapToEntity(domainModel: elephant): elephantCacheEntity {
            return elephantCacheEntity(
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
                nota = domainModel.nota
            )
        }

        fun mapFromEntityList(entities: List<elephantCacheEntity>): List<elephant>{
            return entities.map { mapFromEntity(it) }
        }
    }