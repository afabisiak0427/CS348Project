package com.Storage;

import com.PSU.PSU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {
    List<Storage> findAll();
    Optional<Storage> findById(Integer id);
    List<Storage> findStorageByNameAndTypeAndSizeAndPrice(String name, String type, int size, int price);
}
