package com.willgomes.learnjava.MyStore.Repositories;

import com.willgomes.learnjava.MyStore.Domains.Entities.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductRepository
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>{}