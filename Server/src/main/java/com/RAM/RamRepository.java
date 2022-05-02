package com.RAM;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RamRepository extends JpaRepository<RAM, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM RAM")
    List<RAM> findAllRAM();
    Optional<RAM> findById(Integer id);
}
