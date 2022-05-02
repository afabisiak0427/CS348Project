package com.Controllers;

import com.Brand.BrandDataHandler;
import com.PSU.PSU;
import com.PSU.PSUDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/addPSU")
public class addPSU {
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    PSUDataHandler psuHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addPSU(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];

        String[] psuData = parse[1].split(", ");

        String name = psuData[0];
        int watt = Integer.parseInt(psuData[2].strip());
        String color = psuData[3];
        int price = Integer.parseInt(psuData[4].replace(",", "").strip());

        List<PSU> newPSU = psuHandler.findPSUByEvery(name, watt, color, price);
        Integer newPSUId = newPSU.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setPsu_id(newPSUId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newPSU.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
