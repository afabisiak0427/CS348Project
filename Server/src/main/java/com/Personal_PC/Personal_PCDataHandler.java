package com.Personal_PC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class Personal_PCDataHandler {

    @Autowired
    PersonalRepository personalRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public void savePC(Personal_PC pc) {
        personalRepository.save(pc);
    }

    public List<Personal_PC> getPCbyName(String name) {
        return personalRepository.findPersonal_PCByName(name);
    }

    public List<Personal_PC> findAllNames() { return personalRepository.findAll(); }

    public Optional<Personal_PC> findByID(Integer id) { return personalRepository.findById(id); }

    public Integer findMaxID() { return personalRepository.findMaxID(); }

    @Transactional
    public Personal_PC insertPC(Personal_PC pc) {
        entityManager.persist(pc);
        return pc;
    }
}
