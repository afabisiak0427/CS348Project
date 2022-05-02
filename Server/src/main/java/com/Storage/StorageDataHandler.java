package com.Storage;

import com.PSU.PSU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StorageDataHandler {

    @Autowired
    StorageRepository storageRepository;

    public List<Storage> getAllStorage() {
        return storageRepository.findAll();
    }
    public Optional<Storage> getByID(Integer id) { return storageRepository.findById(id); }
    public List<Storage> findStorageByEvery(String name, String type, int size, int price) {
        return storageRepository.findStorageByNameAndTypeAndSizeAndPrice(name, type, size, price);
    }
}
