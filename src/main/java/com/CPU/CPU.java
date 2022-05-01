package com.CPU;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CPU {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;
    private Integer Brand_id;
    private int Generation;
    private int Cores_number;
    private int Threads_number;
    private int Price;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return Name;
    }

    public void setName(String name) { this.Name = name; }

    public Integer getBrand_id() {
        return Brand_id;
    }

    public void setBrand(Integer brand_id) { this.Brand_id = brand_id; }

    public int getGeneration() {
        return Generation;
    }

    public void setGeneration(Integer gen) { this.Generation = gen; }

    public int getCores_number() {
        return Cores_number;
    }

    public void setCores_number(int cores) { this.Cores_number = cores; }

    public int getThreads_number() {
        return Threads_number;
    }

    public void setThreads_number(int threads) { this.Threads_number = threads; }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) { this.Price = price; }
}