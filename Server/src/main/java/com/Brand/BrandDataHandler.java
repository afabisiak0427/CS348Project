package com.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandDataHandler {

    @Autowired
    BrandRepository brandRepository;

    public Brand getById(Integer id) {
        return brandRepository.findBrandById(id);
    }
    public List<Brand> getByName(String name) { return brandRepository.findBrandByName(name); }
}
