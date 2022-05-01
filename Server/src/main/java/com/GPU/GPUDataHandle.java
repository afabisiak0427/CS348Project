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

@Service
public class GPUDataHandle {
    @Autowired
    private GPURepository gpuRepository;

    public List<GPU> findAll() {
        return gpuRepository.findAll();
    }
    public List<GPU> findCPU(String name) { return gpuRepository.findCPUSByName(name); }
}
