package com.xiong.trpg.bean;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="characterStatisticBasic")
public class StatisticBasic implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name="strength")
    private Integer strength;// 力
    @Column(name="intelligence")
    private Integer intelligence;// 智 ->
    @Column(name="agile")
    private Integer agile; // 敏 ->
    @Column(name="bodySize")
    private Integer bodySize;//体型 -> hp
    @Column(name="appearance")
    private Integer appearance;//外形

}
