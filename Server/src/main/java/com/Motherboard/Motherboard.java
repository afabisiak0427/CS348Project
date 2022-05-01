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
    private String Name;
    private Integer Brand_id;
    private int Size;
    private int Pci_slots;
    private int RAM_slots;
    private String CPU_Generation;
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

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
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
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPci_slots() {
        return Pci_slots;
    }

    public void setPci_slots(int pci_slots) {
        Pci_slots = pci_slots;
    }
}
