package com.cloud.client.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue
    private Integer id;

    private String type;

    @Min(value = 20, message = "level not enough")
    private Integer level;

    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @NotNull(message = "攻击力必填")
    private Integer atk;

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", level=" + level +
                '}';
    }
}
