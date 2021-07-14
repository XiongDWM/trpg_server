package com.xiong.trpg.repository

import com.xiong.trpg.bean.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository:JpaRepository<Player,Long> {
}