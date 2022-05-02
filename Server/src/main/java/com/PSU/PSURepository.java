package com.PSU;

import com.Motherboard.Motherboard;
import com.Storage.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PSURepository extends JpaRepository<PSU, Integer> {
    List<PSU> findAll();
    Optional<PSU> findById(Integer id);
    List<PSU> findPSUByNameAndWattsAndColorAndPrice(String name, int watts, String color, int price);
}
