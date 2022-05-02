package com.RAM;

import com.GPU.GPU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RamRepository extends JpaRepository<RAM, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM RAM")
    List<RAM> findAllRAM();
    Optional<RAM> findById(Integer id);
    List<RAM> findRAMByNameAndMemoryAmtAndNumberOfSticksAndSpeedAndPrice(String name, int memory_amt,
                                                                          int numberSticks,
                                                                         int speed, int price);
}
