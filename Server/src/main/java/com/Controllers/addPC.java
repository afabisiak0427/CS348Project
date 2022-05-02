package com.Controllers;

import com.Personal_PC.Personal_PC;
import com.Personal_PC.Personal_PCDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/addPC")
public class addPC {

    @Autowired
    Personal_PCDataHandler pcHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity addNewPC(@RequestBody String s) {
        String name = s.strip();

        System.out.println("Name:" + name + ":");

        if (name.length() == 0) {
            return ResponseEntity.ok("Error: Please enter a PC name.");
        }

        List<Personal_PC> testPC = pcHandler.getPCbyName(name);

        if (!testPC.isEmpty()) {
            return ResponseEntity.ok("Error: This PC already exists.");
        }

        Integer maxID = pcHandler.findMaxID();
        Personal_PC newPC = new Personal_PC();
        newPC.setName(name);
        newPC.setId(maxID + 1);

        pcHandler.insertPC(newPC);

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
