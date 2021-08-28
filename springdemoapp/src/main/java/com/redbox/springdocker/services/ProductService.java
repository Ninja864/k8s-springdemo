package com.redbox.springdocker.services;

import java.util.List;

import com.redbox.springdocker.commands.ProductForm;
import com.redbox.springdocker.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
