package com.liberty52.product.service.repository;

import com.liberty52.product.service.entity.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOptionRepository extends JpaRepository<ProductOption, String> {
}