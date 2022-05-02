package com.Controllers;

import com.Brand.BrandDataHandler;
import com.Storage.Storage;
import com.Storage.StorageDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/queryStorage")
public class queryStorage {

    @Autowired
    StorageDataHandler storageHandler;
    @Autowired
    BrandDataHandler brandHandler;

    @PostMapping
    @CrossOrigin(origins = "*")
    @ResponseBody
    public ResponseEntity getAllStorage(@RequestBody String s) {
        List<Storage> storageList = storageHandler.getAllStorage();
        String ret = "";

        if (storageList.isEmpty()) {
            return ResponseEntity.ok("Error: There is no storage to choose from");
        }

        for (Storage st : storageList) {
            ret += st.getName() + ", " + brandHandler.getById(st.getBrand_id()).getName() + ", " +
                    st.getType() + ", " + st.getSize() + ", " + st.getPrice() + ";";
        }

        return ResponseEntity.ok(ret);
    }
}
