package com.PSU;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSUDataHandler {

    @Autowired
    PSURepository psuRepository;

    public List<PSU> getAllPSUs() {
        return psuRepository.findAll();
    }
}
