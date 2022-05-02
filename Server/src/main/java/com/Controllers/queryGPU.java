package com.Controllers;
import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.CPU.CPURepository;
import com.GPU.GPU;
import com.GPU.GPUDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/queryGPU")
public class queryGPU {
    @Autowired
    GPUDataHandler gpuHandler;
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllCPUs(@RequestBody String s) {
        String ret = "";
        List<GPU> gpuList = null;

        System.out.println("Request: " + s);

        if (s.compareTo("All") == 0) {
            gpuList = gpuHandler.findAll();
        }
        else {
            gpuList = gpuHandler.findGPU(s);
        }

        if (gpuList.size() == 0) {
            return ResponseEntity.ok("Error: No CPUs could be found.");
        }

        for (GPU c : gpuList) {
            ret += c.getName() + ", " + brandHandler.getById(c.getBrand_id()).getName() + ", " + c.getCores_number() +
                     ", " + c.getMemory() + ", " + c.getPrice() + ";";
        }

        return ResponseEntity.ok(ret.toString());
    }
}
