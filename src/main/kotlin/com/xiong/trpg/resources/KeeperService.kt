package com.xiong.trpg.resources

import com.xiong.trpg.bean.Keeper


interface KeeperService {
    fun create(keeper: Keeper): Long?
}