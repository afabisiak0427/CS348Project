package com.RAM;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RamRepository extends JpaRepository<RAM, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM RAM")
    List<RAM> findAllRAM();
}
