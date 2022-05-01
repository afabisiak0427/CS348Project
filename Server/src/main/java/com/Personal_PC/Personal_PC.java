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
    private String name;
    private Integer cpu_id;
    private Integer gpu_id;
    private Integer ram_id;
    private Integer motherboard_id;
    private Integer storage_id;
    private Integer psu_id;
    private int total_price;

    public Personal_PC() {}

    public Personal_PC(String name) {
        this.name = name;
    }

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

    public Integer getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(Integer cpu_id) {
        this.cpu_id = cpu_id;
    }

    public Integer getGpu_id() {
        return gpu_id;
    }

    public void setGpu_id(Integer gpu_id) {
        this.gpu_id = gpu_id;
    }

    public Integer getRam_id() {
        return ram_id;
    }

    public void setRam_id(Integer ram_id) {
        this.ram_id = ram_id;
    }

    public Integer getMotherboard_id() {
        return motherboard_id;
    }

    public void setMotherboard_id(Integer motherboard_id) {
        this.motherboard_id = motherboard_id;
    }

    public Integer getStorage_id() {
        return storage_id;
    }

    public void setStorage_id(Integer storage_id) {
        this.storage_id = storage_id;
    }

    public Integer getPsu_id() {
        return psu_id;
    }

    public void setPsu_id(Integer psu_id) {
        this.psu_id = psu_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}
