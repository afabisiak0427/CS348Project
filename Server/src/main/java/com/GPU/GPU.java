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
    private String Name;
    private Integer Brand_id;
    private int Cores_number;
    private int Memory;
    private int Price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCores_number() {
        return Cores_number;
    }

    public void setCores_number(int cores_number) {
        Cores_number = cores_number;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Integer getBrand_id() {
        return Brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        Brand_id = brand_id;
    }
}
