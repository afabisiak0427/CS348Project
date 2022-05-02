package com.CPU;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CPURepository extends JpaRepository<CPU, Integer> {
    List<CPU> findAll();
    List<CPU> findCPUSByName(String name);
    Optional<CPU> findById(Integer id);
    List<CPU> findCPUByNameAndGenerationAndCoresNumberAndThreadsNumberAndPrice(String name, int gen, int cores,
                                                                                            int threads, int price);
}
