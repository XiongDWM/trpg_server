package com.xiong.trpg.resources.impl

import com.xiong.trpg.repository.PlayerRepository
import com.xiong.trpg.resources.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlayerServiceImpl:PlayerService {
    @Autowired
    lateinit var playerRepository:PlayerRepository
}