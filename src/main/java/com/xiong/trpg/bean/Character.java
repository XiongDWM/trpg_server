package com.xiong.trpg.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="character")
public class Character implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;
    private String gameUUID;
    private String name;
    private String sex;
    private FinalStatusForCharacter finalStatusForCharacter;

    public enum FinalStatusForCharacter{
        DEAD("死亡"),
        ALIVE("存活");

        FinalStatusForCharacter(String note) {
            this.note = note;
        }
        private String note;

        public String getNote() {

            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameUUID() {
        return gameUUID;
    }

    public void setGameUUID(String gameUUID) {
        this.gameUUID = gameUUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public FinalStatusForCharacter getFinalStatusForCharacter() {
        return finalStatusForCharacter;
    }

    public void setFinalStatusForCharacter(FinalStatusForCharacter finalStatusForCharacter) {
        this.finalStatusForCharacter = finalStatusForCharacter;
    }
}
