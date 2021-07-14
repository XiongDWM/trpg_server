package com.xiong.trpg.repository

import com.xiong.trpg.bean.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository:JpaRepository<Person,Long> {
}