package com.Personal_PC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonalRepository extends JpaRepository<Personal_PC, Integer> {
    List<Personal_PC> findPersonal_PCByName(String name);
    List<Personal_PC> findAll();
    Optional<Personal_PC> findPersonal_PCById(Integer id);
    @Query(nativeQuery = true, value = "SELECT MAX(id) FROM personal_pc")
    Integer findMaxID();
}
