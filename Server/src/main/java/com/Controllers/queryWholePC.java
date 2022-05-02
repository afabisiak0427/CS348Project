package com.Controllers;

import com.Brand.Brand;
import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.CPU.CPURepository;
import com.GPU.GPU;
import com.GPU.GPUDataHandler;
import com.GPU.GPURepository;
import com.Motherboard.Motherboard;
import com.Motherboard.MotherboardDataHandler;
import com.PSU.PSU;
import com.PSU.PSUDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import com.RAM.RAM;
import com.RAM.RamDataHandler;
import com.Storage.Storage;
import com.Storage.StorageDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/queryWholePC")
public class queryWholePC {

    @Autowired
    Personal_PCDataHandler pcHandler;
    @Autowired
    CPUDataHandler cpuHandler;
    @Autowired
    GPUDataHandler gpuHandler;
    @Autowired
    MotherboardDataHandler motherboardHandler;
    @Autowired
    PSUDataHandler psuHandler;
    @Autowired
    RamDataHandler ramHandler;
    @Autowired
    StorageDataHandler storageHandler;
    @Autowired
    BrandDataHandler brandHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getWholePC(@RequestBody String s) {
        String ret;

        List<Personal_PC> tempPC = pcHandler.getPCbyName(s);

        System.out.println(s);

        if (tempPC.isEmpty()) {
            return ResponseEntity.ok("Error: No such PC Exists");
        }

        Personal_PC retPC = tempPC.get(0);

        Optional<CPU> retCPU = cpuHandler.findById(retPC.getCpu_id());
        Optional<GPU> retGPU = gpuHandler.findById(retPC.getGpu_id());
        Optional<Motherboard> retMotherboard = motherboardHandler.findByID(retPC.getMotherboard_id());
        Optional<PSU> retPSU = psuHandler.getByID(retPC.getPsu_id());
        Optional<RAM> retRAM = ramHandler.getByID(retPC.getRam_id());
        Optional<Storage> retStorage = storageHandler.getByID(retPC.getStorage_id());

        String cpu = "CPU: ";
        int cpuPrice = 0;
        String gpu = "GPU: ";
        int gpuPrice = 0;
        String motherboard = "Motherboard: ";
        int motherboardPrice = 0;
        String psu = "PSU: ";
        int psuPrice = 0;
        String ram = "RAM: ";
        int ramPrice = 0;
        String storage = "Storage: ";
        int storagePrice = 0;
        Brand tempBrand = null;
        int totalPrice = 0;

        if (retCPU.isEmpty()) {
            cpu += "Empty";
        }
        else {
            CPU tempCPU = retCPU.get();
            tempBrand = brandHandler.getById(tempCPU.getBrand_id());
            cpuPrice = tempCPU.getPrice();
            cpu += tempBrand.getName() + " " + tempCPU.getName() + "\tRating: " + tempBrand.getRating() + "\tPrice: " +
            cpuPrice;
        }

        if (retGPU.isEmpty()) {
            gpu += "Empty";
        }
        else {
            GPU tempGPU = retGPU.get();
            tempBrand = brandHandler.getById(tempGPU.getBrand_id());
            gpuPrice = tempGPU.getPrice();
            gpu += tempBrand.getName() + " " + tempGPU.getName() + "\tRating: " + tempBrand.getRating() + "\tPrice: " +
            gpuPrice;
        }

        if (retMotherboard.isEmpty()) {
            motherboard += "Empty";
        }
        else {
            Motherboard tempMotherboard = retMotherboard.get();
            tempBrand = brandHandler.getById(tempMotherboard.getBrand_id());
            motherboardPrice = tempMotherboard.getPrice();
            motherboard += tempBrand.getName() + " " + tempMotherboard.getName() + "\tRating: " + tempBrand.getRating()
            + "\tPrice: " + motherboardPrice;
        }

        if (retPSU.isEmpty()) {
            psu += "Empty";
        }
        else {
            PSU tempPSU = retPSU.get();
            tempBrand = brandHandler.getById(tempPSU.getBrand_id());
            psuPrice = tempPSU.getPrice();
            psu += tempBrand.getName() + " " + tempPSU.getName() + "\tRating: " + tempBrand.getRating() + "\tPrice: " +
            psuPrice;
        }

        if (retRAM.isEmpty()) {
            ram += "Empty";
        }
        else {
            RAM tempRam = retRAM.get();
            tempBrand = brandHandler.getById(tempRam.getBrand_id());
            ramPrice = tempRam.getPrice();
            ram += tempBrand.getName() + " " + tempRam.getName() + "\tRating: " + tempBrand.getRating() + "\tPrice: " +
                    ramPrice;
        }

        if (retStorage.isEmpty()) {
            storage += "Empty";
        }
        else {
            Storage tempStorage = retStorage.get();
            tempBrand = brandHandler.getById(tempStorage.getBrand_id());
            storagePrice = tempStorage.getPrice();
            storage += tempBrand.getName() + " " + tempStorage.getName() + "\tRating: " + tempBrand.getRating() +
                    "\tPrice: " + storagePrice;
        }

        totalPrice = retPC.getTotal_price();

        ret = cpu + ", " + gpu + ", " + motherboard + ", " + psu + ", " + ram + ", " + storage + ", " +
                "Total Price: " + totalPrice;

        return ResponseEntity.ok(ret);
    }

}
