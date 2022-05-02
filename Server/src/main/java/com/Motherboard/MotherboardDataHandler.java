package com.Motherboard;
import com.CPU.CPU;
import com.CPU.CPURepository;
import com.GPU.GPU;
import com.GPU.GPURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotherboardDataHandler {
    @Autowired
    private MotherboardRepository motherboardRepository;

    public List<Motherboard> findAll() {
        return motherboardRepository.findAll();
    }
    public List<Motherboard> findMotherboard(String name) { return motherboardRepository.findMotherboardByName(name); }
    public Optional<Motherboard> findByID(Integer id) { return motherboardRepository.findById(id); }
}
