package com.xiong.trpg.bean

import javax.persistence.*

@Entity
@Table(name="player")
open class Player(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    val id:Long?=0,
    @Column(name="name")
    val name:String,
    @Column(name="password")
    val password:String
)