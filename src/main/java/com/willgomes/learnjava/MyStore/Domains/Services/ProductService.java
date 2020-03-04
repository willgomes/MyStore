package com.willgomes.learnjava.MyStore.Domains.Services;

import java.util.List;
import java.util.Optional;

import com.willgomes.learnjava.MyStore.Domains.Entities.Product;
import com.willgomes.learnjava.MyStore.Repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository _productRepository;

    public void save(Product product){
        _productRepository.save(product);
    }

    public List<Product> findAll(){
        return _productRepository.findAll();
    }

    public long count(){
        return _productRepository.count();
    }

    public Optional<Product> findById(String id){
        return _productRepository.findById(id);
    }

    public void delete(String id){
        _productRepository.deleteById(id);
    }

    public void update(Product product){
        _productRepository.save(product);
    }

}