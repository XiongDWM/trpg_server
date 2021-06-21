package com.xiong.trpg.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="props")
public class Props implements Serializable {
    private static final long serialVersionUID=1L;
    private Long id;
    private String name;
    private Long price;
    private String inWhichDecade;
    private String type;
    private Integer count;

}
