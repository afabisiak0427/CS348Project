package com.Motherboard;
import com.CPU.CPU;
import com.GPU.GPU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Integer> {
    List<Motherboard> findAll();
    List<Motherboard> findCPUSByName(String name);
}