package com.CPU;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CPUDataHandler {

    @Autowired
    private CPURepository cpuRepository;

    public List<CPU> findAll() {
        return cpuRepository.findAll();
    }
    public List<CPU> findCPU(String name) { return cpuRepository.findCPUByName(name); }
}
