package com.Controllers;

import com.Brand.BrandDataHandler;
import com.RAM.RAM;
import com.RAM.RamDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/queryRAM")
public class queryRAM {

    @Autowired
    RamDataHandler ramHandler;
    @Autowired
    BrandDataHandler brandHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllRams(@RequestBody String s) {
        List<RAM> ramList = ramHandler.getAllRams();
        String ret = "";

        if (ramList.isEmpty()) {
            return ResponseEntity.ok("Error: No RAMs could be found.");
        }

        for (RAM r : ramList) {
            ret += r.getName() + ", " + brandHandler.getById(r.getBrand_id()).getName() + ", " +
                    r.getMemory_amt() + ", " + r.getNumber_of_sticks() + ", " + r.getSpeed() + ", " +
                    r.getPrice() + ";";
        }

        return ResponseEntity.ok(ret);
    }
}
