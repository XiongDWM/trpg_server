package com.xiong.trpg.rest;

import com.xiong.trpg.bean.Game;
import com.xiong.trpg.resources.GameService;
import com.xiong.trpg.utils.UtilResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping("/game/raiseGameAsKeeper")
    public UtilResultSet raiseAsKeeper(String alias,String fileUUID,Integer decade){
        return UtilResultSet.success(gameService.raiseGameAsKeeper(alias,fileUUID,decade));
    }
}
