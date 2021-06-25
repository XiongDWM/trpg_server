package com.xiong.trpg.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="character")
public class Character implements Serializable {

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name="game_uuid")
    private String gameUUID;
    @Column(name="name")
    private String name;
    @Column(name="sex")
    private String sex;
    @Column(name="age")
    private Integer age;
    @Column(name="final_status")
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
