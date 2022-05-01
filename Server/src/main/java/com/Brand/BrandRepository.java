package com.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    Brand findBrandById(Integer id);
}
