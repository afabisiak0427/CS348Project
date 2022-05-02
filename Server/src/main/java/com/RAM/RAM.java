package com.RAM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RAM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer brand_id;
    private int memory_amt;
    private int number_of_sticks;
    private int speed;
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
        this.name = name;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public int getMemory_amt() {
        return memory_amt;
    }

    public void setMemory_amt(int memory_amt) {
        this.memory_amt = memory_amt;
    }

    public int getNumber_of_sticks() {
        return number_of_sticks;
    }

    public void setNumber_of_sticks(int number_of_sticks) {
        this.number_of_sticks = number_of_sticks;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
