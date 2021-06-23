package com.xiong.trpg.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "alias")
    private String alias; //该局别名

    @Column(name = "game_uuid")
    private String gameUUID;

    @Column(name = "file_uuid")
    private String file_uuid;

    @Column(name="in_decade")
    private Integer inDecade; //所属年代

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setName(String alias) {
        this.alias = alias;
    }

    public String getGameUUID() {
        return gameUUID;
    }

    public void setGameUUID(String gameUUID) {
        this.gameUUID = gameUUID;
    }

    public String getFile_uuid() {
        return file_uuid;
    }

    public void setFile_uuid(String file_uuid) {
        this.file_uuid = file_uuid;
    }

    public Integer getInDecade() {
        return inDecade;
    }

    public void setInDecade(Integer inDecade) {
        this.inDecade = inDecade;
    }
}
