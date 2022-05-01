package com.Controllers;

import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.CPU.CPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllCPUs() {
/*        List<CPU> cpuList = cpuHandler.findAll();
        ArrayList<String> retList = new ArrayList<>();

        for (CPU c : cpuList) {
            retList.add(c.getName() + ", " + brandHandler.getById(c.getBrand_id()).getName() + ", " +
                    c.getGeneration() + ", " + c.getCores_number() + ", " + c.getThreads_number() + ", " +
                    c.getPrice());
        }

        for (String s : retList) {
            System.out.println(s);
        }*/

/*        List<CPU> regCPU = cpuHandler.findCPU("name");

        System.out.println(regCPU.toString());*/

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
