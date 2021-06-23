package com.xiong.trpg.bean;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="props")
public class Items implements Serializable {
    private static final long serialVersionUID=1L;

    private Long id;
    private String name;
    private Long price;
    private String inDecade;
    private ItemType type;
    private String damage;

    public enum ItemType{
        GOODS("物品"),
        WEAPON("武器");
        ItemType(String note){
            this.note=note;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getInDecade() {
        return inDecade;
    }

    public void setInDecade(String inDecade) {
        this.inDecade = inDecade;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }
}
