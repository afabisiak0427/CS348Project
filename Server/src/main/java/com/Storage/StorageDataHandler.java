package com.Storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageDataHandler {

    @Autowired
    StorageRepository storageRepository;

    public List<Storage> getAllStorage() {
        return storageRepository.findAll();
    }
}
