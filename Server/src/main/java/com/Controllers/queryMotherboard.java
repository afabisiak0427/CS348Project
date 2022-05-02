package com.Controllers;
import com.Brand.BrandDataHandler;
import com.CPU.CPU;
import com.CPU.CPUDataHandler;
import com.CPU.CPURepository;
import com.Motherboard.Motherboard;
import com.Motherboard.MotherboardDataHandler;
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
@RequestMapping("/queryMotherboard")
public class queryMotherboard {
    @Autowired
    MotherboardDataHandler motherboardHandler;
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllCPUs(@RequestBody String s) {
        String ret = "";
        List<Motherboard> motherboardList = null;

        System.out.println("Request: " + s);

        if (s.compareTo("All") == 0) {
            motherboardList = motherboardHandler.findAll();
        }
        else {
            motherboardList = motherboardHandler.findCPU(s);
        }

        if (motherboardList.size() == 0) {
            return ResponseEntity.ok("Error: No CPUs could be found.");
        }

        for (Motherboard c : motherboardList) {
            ret += c.getName() + ", " + brandHandler.getById(c.getBrand_id()).getName() + ", " +
                    c.getSize() + ", " + c.getRAM_slots() + ", " + c.getCPU_Generation() + ", " +
                    c.getPci_slots() + ", " + c.getPrice() + ";";
        }

        return ResponseEntity.ok(ret.toString());
    }
}
