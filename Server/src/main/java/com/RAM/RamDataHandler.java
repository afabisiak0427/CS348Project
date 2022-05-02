package com.RAM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RamDataHandler {

    @Autowired
    RamRepository ramRepository;

    public List<RAM> getAllRams() {
        return ramRepository.findAll();
    }
    public Optional<RAM> getByID(Integer id) { return ramRepository.findById(id); }
}
