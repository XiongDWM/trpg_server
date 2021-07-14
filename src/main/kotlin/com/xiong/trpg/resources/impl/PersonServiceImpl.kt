package com.xiong.trpg.resources.impl

import com.xiong.trpg.bean.Person
import com.xiong.trpg.repository.PersonRepository
import com.xiong.trpg.resources.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonServiceImpl : PersonService {
    @Autowired
    lateinit var personRepository: PersonRepository

    override fun create(person: Person): Long? {
       personRepository.save(person)
        return person.id;
    }
}