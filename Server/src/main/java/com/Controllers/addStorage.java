package com.Controllers;

import com.Brand.BrandDataHandler;
import com.Storage.Storage;
import com.Storage.StorageDataHandler;
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
@RequestMapping("/addStorage")
public class addStorage {
    @Autowired
    BrandDataHandler brandHandler;
    @Autowired
    StorageDataHandler storageHandler;
    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addStorage(@RequestBody String s) {
        String[] parse = s.split("; ");

        String pc = parse[0];

        String[] storageData = parse[1].split(", ");
        String name = storageData[0];
        String type = storageData[2];
        int size = Integer.parseInt(storageData[3].strip());
        int price = Integer.parseInt(storageData[4].replace(",", "").strip());

        List<Storage> newStorage = storageHandler.findStorageByEvery(name, type, size, price);
        Integer newStorageId = newStorage.get(0).getId();

        List<Personal_PC> listPC = pcHandler.getPCbyName(pc);

        Personal_PC updatePC = listPC.get(0);

        updatePC.setStorage_id(newStorageId);
        updatePC.setTotal_price(updatePC.getTotal_price() + newStorage.get(0).getPrice());

        pcHandler.savePC(updatePC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
