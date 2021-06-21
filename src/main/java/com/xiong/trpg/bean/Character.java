package com.xiong.trpg.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="character")
public class Character implements Serializable {

    private static final long serialVersionUID=1L;


    private Long gameUID;
    private String name;
    private String sex;


}
