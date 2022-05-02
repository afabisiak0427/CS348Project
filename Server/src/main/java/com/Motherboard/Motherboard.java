package com.Motherboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer brand_id;
    private String size;
    private int pci_slots;
    private int RAM_slots;
    private String CPU_Generation;
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

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        brand_id = brand_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int size) {
        size = size;
    }

    public int getRAM_slots() {
        return RAM_slots;
    }

    public void setRAM_slots(int RAM_slots) {
        this.RAM_slots = RAM_slots;
    }

    public String getCPU_Generation() {
        return CPU_Generation;
    }

    public void setCPU_Generation(String CPU_Generation) {
        this.CPU_Generation = CPU_Generation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        price = price;
    }

    public int getPci_slots() {
        return pci_slots;
    }

    public void setPci_slots(int pci_slots) {
        pci_slots = pci_slots;
    }
}
