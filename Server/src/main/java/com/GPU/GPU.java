package com.GPU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GPU {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer brand_id;
    private int cores_number;
    private int memory;
    private int price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getCores_number() {
        return cores_number;
    }

    public void setCores_number(int cores_number) {
        cores_number = cores_number;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        price = price;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        brand_id = brand_id;
    }
}
