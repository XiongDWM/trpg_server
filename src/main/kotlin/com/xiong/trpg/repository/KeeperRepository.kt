package com.xiong.trpg.repository

import com.xiong.trpg.bean.Keeper
import org.springframework.data.jpa.repository.JpaRepository

interface KeeperRepository:JpaRepository<Keeper,Long> {
}