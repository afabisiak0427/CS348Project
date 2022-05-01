package com.Controllers;

import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/queryPC")
public class queryPC {

    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllPc(@RequestBody String s) {
        System.out.println(s);
        List<Personal_PC> ret = null;
        String retString = "";
        if (s.compareTo("All") == 0) {
            ret = pcHandler.findAllNames();

            for (Personal_PC pc : ret) {
                retString += pc.getName() + ", ";
            }
        }
        else {
            ret = pcHandler.getPCbyName(s);
            if (ret.isEmpty()) {
                return ResponseEntity.ok("No PC's with this name.");
            }
            else {
                for (Personal_PC pc : ret) {
                    retString += pc.getName() + ", ";
                }
            }
        }

        return ResponseEntity.ok(retString);
    }
}
