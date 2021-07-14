package com.xiong.trpg.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.xiong.trpg.bean.Person
import com.xiong.trpg.resources.PersonService
import com.xiong.trpg.utils.UtilResultSet
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var personService:PersonService


    @RequestMapping("/keeper/create")
    fun createKeeper(keeperString:String):UtilResultSet?{
        val mapper:ObjectMapper= ObjectMapper();
        val person:Person=mapper.readValue(keeperString,Person::class.java)
        return UtilResultSet.success(personService.create(person));
    }

}