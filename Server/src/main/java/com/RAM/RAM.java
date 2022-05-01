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
    private String Name;
    private Integer Brand_id;
    private int Memory_amt;
    private int Number_of_sticks;
    private int Speed;
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

    public Integer getBrand_id() {
        return Brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        Brand_id = brand_id;
    }

    public int getMemory_amt() {
        return Memory_amt;
    }

    public void setMemory_amt(int memory_amt) {
        Memory_amt = memory_amt;
    }

    public int getNumber_of_sticks() {
        return Number_of_sticks;
    }

    public void setNumber_of_sticks(int number_of_sticks) {
        Number_of_sticks = number_of_sticks;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
