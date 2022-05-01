package com.Controllers;

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
import java.util.List;

@Controller
@RequestMapping("/queryCPU")
public class queryCPU {

    @Autowired
    CPUDataHandler cpuHandler;

    @GetMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllCPUs() {
        System.out.println("I am Here");

        List<CPU> cpuList = cpuHandler.findAll();

        for (CPU c : cpuList) {
            System.out.println(c.toString());
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
