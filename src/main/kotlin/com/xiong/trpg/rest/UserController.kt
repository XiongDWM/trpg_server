package com.xiong.trpg.rest

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.util.JSONPObject
import com.xiong.trpg.bean.Keeper
import com.xiong.trpg.resources.KeeperService
import com.xiong.trpg.resources.PlayerService
import com.xiong.trpg.utils.UtilResultSet
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var keeperService:KeeperService
    @Autowired
    lateinit var playerService: PlayerService

    @RequestMapping("/keeper/create")
    fun createKeeper(keeperString:String):UtilResultSet?{
        val mapper:ObjectMapper= ObjectMapper();
        val keeper:Keeper=mapper.readValue(keeperString,Keeper::class.java)
        return UtilResultSet.success(keeperService.create(keeper));
    }

}