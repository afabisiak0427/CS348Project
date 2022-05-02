package com.RAM;

import com.GPU.GPU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RamDataHandler {

    @Autowired
    RamRepository ramRepository;

    public List<RAM> getAllRams() {
        return ramRepository.findAll();
    }
    public Optional<RAM> getByID(Integer id) { return ramRepository.findById(id); }
    public List<RAM> findGPUByEvery( String name, int memoryAmt, int numberOfsticks, int speed, int price) {
        return ramRepository.findRAMByNameAndMemoryAmtAndNumberOfSticksAndSpeedAndPrice(name, memoryAmt,
                numberOfsticks, speed, price);
    }

}
