package com.CPU;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class CPUDataHandler {

    @Autowired
    private CPURepository cpuRepository;

    public List<CPU> findAll() {
        return cpuRepository.findAll();
    }
    public List<CPU> findCPU(String name) { return cpuRepository.findCPUSByName(name); }
    public Optional<CPU> findById(Integer id) { return cpuRepository.findById(id); }
    public List<CPU> findCPUByEvery(String name, int gen, int cores, int threads, int price) {
        return cpuRepository.findCPUByNameAndGenerationAndCoresNumberAndThreadsNumberAndPrice(name, gen, cores,
                threads, price);
    }
}
