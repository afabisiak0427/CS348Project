package com.Controllers;

import com.Brand.BrandDataHandler;
import com.PSU.PSU;
import com.PSU.PSUDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/queryPSU")
public class queryPSU {

    @Autowired
    PSUDataHandler psuHandler;
    @Autowired
    BrandDataHandler brandHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllPSUs(@RequestBody String s) {
        List<PSU> psuList = psuHandler.getAllPSUs();
        String ret = "";

        if (psuList.isEmpty()) {
            return ResponseEntity.ok("Error: There are no PSUs");
        }

        for (PSU p : psuList) {
            ret += p.getName() + ", " + brandHandler.getById(p.getBrand_id()).getName() + ", " +
                    p.getWatts() + ", " + p.getColor() + ", " + p.getPrice() + ";";
        }

        return ResponseEntity.ok(ret);
    }
}
