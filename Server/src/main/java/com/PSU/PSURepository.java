package com.PSU;

import com.Storage.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PSURepository extends JpaRepository<PSU, Integer> {
    List<PSU> findAll();
}
