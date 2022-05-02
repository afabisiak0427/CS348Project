package com.GPU;

import com.CPU.CPU;
import com.CPU.CPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GPUDataHandler {
    @Autowired
    private GPURepository gpuRepository;

    public List<GPU> findAll() {
        return gpuRepository.findAll();
    }
    public List<GPU> findGPU(String name) { return gpuRepository.findGPUSByName(name); }
    public Optional<GPU> findById(Integer id) { return gpuRepository.findById(id); }
}
