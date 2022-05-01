package com.GPU;

import com.CPU.CPU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GPURepository extends JpaRepository<GPU, Integer> {
    List<GPU> findAll();
    List<GPU> findCPUSByName(String name);
}

