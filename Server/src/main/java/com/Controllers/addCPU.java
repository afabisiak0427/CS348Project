package com.Controllers;

import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/addCPU")
public class addCPU {

    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    CPUDataHandler cpuHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addCPU(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];

        String[] cpuData = parse[1].split(", ");

        String name = cpuData[0];
        Integer brandId = brandHandler.getByName(cpuData[1].strip()).get(0).getId();
        int gen = Integer.parseInt(cpuData[2].strip());
        int cores = Integer.parseInt(cpuData[3].strip());
        int threads = Integer.parseInt(cpuData[4].strip());
        int price = Integer.parseInt(cpuData[5].replace(",", "").strip());

        List<CPU> newCPU = cpuHandler.findCPUByEvery(name, gen, cores, threads, price);
        Integer newCPUId = newCPU.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setCpu_id(newCPUId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newCPU.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
