package com.Controllers;
import com.Brand.BrandDataHandler;
import com.Motherboard.Motherboard;
import com.Motherboard.MotherboardDataHandler;
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
@RequestMapping("/addMotherboard")
public class addMotherboard {
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    MotherboardDataHandler MotherboardHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;
    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addMotherboard(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];
        String[] motherboardData = parse[1].split(", ");

        String name = motherboardData[0];
        String size = motherboardData[2];
        int pciSlots = Integer.parseInt(motherboardData[5].strip());
        String CPUGeneration = motherboardData[4];
        int price = Integer.parseInt(motherboardData[6].replace(",", "").strip());

        List<Motherboard> newMotherboard = MotherboardHandler.findMotherboardByEvery(name, size, pciSlots, CPUGeneration, price);

        Integer newMotherboardId = newMotherboard.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setMotherboard_id(newMotherboardId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newMotherboard.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
