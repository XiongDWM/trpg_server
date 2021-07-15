package com.xiong.trpg.repository

import com.xiong.trpg.bean.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface PersonRepository:JpaRepository<Person,Long> {
    @Query
    fun findOneByName(user: String):Person?
}