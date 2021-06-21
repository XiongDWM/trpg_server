package com.xiong.trpg.bean;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="character_statistic_basic")

public class StatisticBasic implements Serializable {
    private static final long serialVersionUID=1L;
    private Integer strength;// 力
    private Integer intelligence;// 智 ->
    private Integer agile; // 敏 ->
    private Integer bodySize;//体型 -> hp
    private Integer appearance;//外形

}
