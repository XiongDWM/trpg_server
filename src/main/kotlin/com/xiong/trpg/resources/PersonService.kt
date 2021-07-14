package com.xiong.trpg.resources

import com.xiong.trpg.bean.Person


interface PersonService {
    fun create(person: Person): Long?
}