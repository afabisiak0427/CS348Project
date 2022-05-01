package com.Personal_PC;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personal_PC {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;
    private Integer CPU_id;
    private Integer GPU_id;
    private Integer RAM_id;
    private Integer Motherboard_id;
    private Integer Storage_id;
    private Integer PSU_id;
    private int Total_price;

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

    public Integer getCPU_id() {
        return CPU_id;
    }

    public void setCPU_id(Integer CPU_id) {
        this.CPU_id = CPU_id;
    }

    public Integer getGPU_id() {
        return GPU_id;
    }

    public void setGPU_id(Integer GPU_id) {
        this.GPU_id = GPU_id;
    }

    public Integer getRAM_id() {
        return RAM_id;
    }

    public void setRAM_id(Integer RAM_id) {
        this.RAM_id = RAM_id;
    }

    public Integer getMotherboard_id() {
        return Motherboard_id;
    }

    public void setMotherboard_id(Integer motherboard_id) {
        Motherboard_id = motherboard_id;
    }

    public Integer getStorage_id() {
        return Storage_id;
    }

    public void setStorage_id(Integer storage_id) {
        Storage_id = storage_id;
    }

    public Integer getPSU_id() {
        return PSU_id;
    }

    public void setPSU_id(Integer PSU_id) {
        this.PSU_id = PSU_id;
    }

    public int getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(int total_price) {
        Total_price = total_price;
    }
}
