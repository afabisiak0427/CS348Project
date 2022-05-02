package com.Controllers;

import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.CPU.CPURepository;
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
@RequestMapping("/queryCPU")
public class queryCPU {

    @Autowired
    CPUDataHandler cpuHandler;
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllCPUs(@RequestBody String s) {
        String ret = "";
        List<CPU> cpuList = null;

        System.out.println("Request: " + s);

        if (s.compareTo("All") == 0) {
            cpuList = cpuHandler.findAll();
        }
        else {
            cpuList = cpuHandler.findCPU(s);
        }

        if (cpuList.size() == 0) {
            return ResponseEntity.ok("Error: No CPUs could be found.");
        }

        for (CPU c : cpuList) {
            ret += c.getName() + ", " + brandHandler.getById(c.getBrand_id()).getName() + ", " +
                    c.getGeneration() + ", " + c.getCoresNumber() + ", " + c.getThreadsNumber() + ", " +
                    c.getPrice() + ";";
        }

        return ResponseEntity.ok(ret.toString());
    }
}
