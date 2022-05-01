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
    private String name;
    private Integer brand_id;
    private int generation;
    private int cores_number;
    private int threads_number;
    private int price;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand(Integer brand_id) { this.brand_id = brand_id; }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(Integer gen) { this.generation = gen; }

    public int getCores_number() {
        return cores_number;
    }

    public void setCores_number(int cores) { this.cores_number = cores; }

    public int getThreads_number() {
        return threads_number;
    }

    public void setThreads_number(int threads) { this.threads_number = threads; }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() {
        return "CPU{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Brand_id=" + brand_id +
                ", Generation=" + generation +
                ", Cores_number=" + cores_number +
                ", Threads_number=" + threads_number +
                ", Price=" + price +
                '}';
    }
}