package com.xiong.trpg.resources.impl

import com.xiong.trpg.bean.Keeper
import com.xiong.trpg.repository.KeeperRepository
import com.xiong.trpg.resources.KeeperService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KeeperServiceImpl : KeeperService {
    @Autowired
    lateinit var keeperRepository: KeeperRepository

    override fun create(keeper: Keeper): Long? {
       keeperRepository.save(keeper)
        return keeper.id;
    }
}