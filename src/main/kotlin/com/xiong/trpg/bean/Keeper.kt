package com.xiong.trpg.bean

import com.xiong.trpg.bean.Game
import javax.persistence.*

/**
 * kp类
 */
@Entity
@Table(name="keeper")
data class Keeper(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: Long?=0,

    @Column(name = "name")
    val name: String,

    @Column(name = "password")
    val password: String,

/*    @OneToMany(cascade = [(CascadeType.REFRESH)], fetch = FetchType.EAGER, targetEntity = Game::class)
    @JoinTable(

    )
    val game: HashSet<Game>?=null*/
)
