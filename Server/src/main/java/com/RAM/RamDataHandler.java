package com.RAM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RamDataHandler {

    @Autowired
    RamRepository ramRepository;

    public List<RAM> getAllRams() {
        return ramRepository.findAll();
    }
}
