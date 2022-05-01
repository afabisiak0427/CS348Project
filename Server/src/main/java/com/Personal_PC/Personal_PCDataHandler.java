package com.Personal_PC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Personal_PCDataHandler {

    @Autowired
    PersonalRepository personalRepository;

    public void savePC(Personal_PC pc) {
        personalRepository.save(pc);
    }
}
