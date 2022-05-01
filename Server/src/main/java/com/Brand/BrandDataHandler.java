package com.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandDataHandler {

    @Autowired
    BrandRepository brandRepository;

    public Brand getById(Integer id) {
        return brandRepository.findBrandById(id);
    }
}
