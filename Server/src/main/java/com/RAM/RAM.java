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
    private Integer brandId;
    private int memoryAmt;
    private int numberOfSticks;
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
        return brandId;
    }

    public void setBrand_id(Integer brand_id) {
        this.brandId = brand_id;
    }

    public int getMemory_amt() {
        return memoryAmt;
    }

    public void setMemory_amt(int memory_amt) {
        this.memoryAmt = memory_amt;
    }

    public int getNumber_of_sticks() {
        return numberOfSticks;
    }

    public void setNumber_of_sticks(int number_of_sticks) {
        this.numberOfSticks = number_of_sticks;
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
