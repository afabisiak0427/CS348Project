package com.Personal_PC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalRepository extends JpaRepository<Personal_PC, Integer> {
    List<Personal_PC> findPersonal_PCByName(String name);
    List<Personal_PC> findAll();
}
