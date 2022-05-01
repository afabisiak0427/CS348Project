package com.Personal_PC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Personal_PCDataHandler {

    @Autowired
    PersonalRepository personalRepository;

    public void savePC(Personal_PC pc) {
        personalRepository.save(pc);
    }

    public List<Personal_PC> getPCbyName(String name) {
        return personalRepository.findPersonal_PCByName(name);
    }

    public List<Personal_PC> findAllNames() { return personalRepository.findAll(); }
}
