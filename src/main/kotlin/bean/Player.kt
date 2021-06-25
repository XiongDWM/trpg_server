package bean

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

open class Player(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long,
    @Column(name="name")
    val name:String,
    @Column(name="password")
    val password:String
)