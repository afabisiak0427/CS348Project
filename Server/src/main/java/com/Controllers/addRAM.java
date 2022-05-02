package com.Controllers;
import com.Brand.BrandDataHandler;
import com.RAM.RAM;
import com.RAM.RamDataHandler;
import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import com.RAM.RamDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/addRAM")
public class addRAM {
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    RamDataHandler ramHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addRAM(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];
        System.out.println("SSSSSSSSSS"+pc);
        String[] ramData = parse[1].split(", ");
        System.out.println(Arrays.toString(parse));
        System.out.println(Arrays.toString(ramData));
        String name = ramData[0];
        int memory = Integer.parseInt(ramData[2].strip());
        int Sticks = Integer.parseInt(ramData[3].strip());
        int speed = Integer.parseInt(ramData[4].strip());
        int price = Integer.parseInt(ramData[5].replace(",", "").strip());

        List<RAM> newRAM = ramHandler.findGPUByEvery(name, memory, Sticks, speed, price);

        System.out.println(newRAM);
        Integer newRAMId = newRAM.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setRam_id(newRAMId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newRAM.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
