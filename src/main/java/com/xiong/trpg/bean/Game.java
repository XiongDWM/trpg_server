package com.xiong.trpg.bean;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="game")
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
    private String fileUUID;

    @Column(name="in_decade")
    private Integer inDecade; //所属年代

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="keeper",referencedColumnName = "id")
    private Person keeper;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name="who_play",
            joinColumns = {@JoinColumn(name = "gameUUid",referencedColumnName = "game_uuid")},
            inverseJoinColumns ={@JoinColumn(name="id",referencedColumnName = "id")} )
    private Set<Person> players;

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

    public String getFileUUID() {
        return fileUUID;
    }

    public void setFileUUID(String file_uuid) {
        this.fileUUID = file_uuid;
    }

    public Integer getInDecade() {
        return inDecade;
    }

    public void setInDecade(Integer inDecade) {
        this.inDecade = inDecade;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Person getKeeper() {
        return keeper;
    }

    public void setKeeper(Person keeper) {
        this.keeper = keeper;
    }

    public Set<Person> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Person> players) {
        this.players = players;
    }
}
