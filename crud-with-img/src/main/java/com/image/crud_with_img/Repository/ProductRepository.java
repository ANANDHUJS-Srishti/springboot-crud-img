package com.image.crud_with_img.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.crud_with_img.Modal.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
