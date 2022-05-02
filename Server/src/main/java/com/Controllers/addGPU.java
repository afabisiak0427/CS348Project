package com.Controllers;
import com.Brand.BrandDataHandler;
import com.GPU.GPU;
import com.GPU.GPUDataHandler;
import com.GPU.GPUDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/addGPU")
public class addGPU {
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    GPUDataHandler gpuHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;
    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addGPU(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];
        System.out.println("SSSSSSSSSS"+pc);
        String[] gpuData = parse[1].split(", ");
        System.out.println(Arrays.toString(parse));
        System.out.println(Arrays.toString(gpuData));
        String name = gpuData[0];
        int cores_number = Integer.parseInt(gpuData[2].strip());
        int memory = Integer.parseInt(gpuData[3].strip());
        int price = Integer.parseInt(gpuData[4].replace(",", "").strip());

        List<GPU> newGPU = gpuHandler.findGPUByEvery(name, cores_number, memory, price);

        System.out.println(newGPU);
        Integer newGPUId = newGPU.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setGpu_id(newGPUId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newGPU.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
