package com.redbox.springdocker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.redbox.springdocker.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
