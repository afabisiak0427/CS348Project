package com.GPU;

import com.CPU.CPU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GPURepository extends JpaRepository<GPU, Integer> {
    List<GPU> findAll();
    List<GPU> findGPUSByName(String name);
    Optional<GPU> findById(Integer id);
    List<GPU> findGPUByNameAndMemoryAndCoresNumberAndPrice(String name, int memory, int cores_number, int price);
}

