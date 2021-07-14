package com.xiong.trpg.bean

import com.fasterxml.jackson.annotation.JsonIgnore
import com.xiong.trpg.bean.Game
import java.io.Serializable
import javax.persistence.*

/**
 * kp类
 */
@Entity
@Table(name = "person")
data class Person(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Long? = 0,

        @Column(name = "name")
        val name: String,

        @Column(name = "password")
        val password: String,

/*    @OneToMany(cascade = [(CascadeType.REFRESH)], fetch = FetchType.EAGER, targetEntity = Game::class)
    @JoinTable(

    )
    val game: HashSet<Game>?=null*/
):Serializable
