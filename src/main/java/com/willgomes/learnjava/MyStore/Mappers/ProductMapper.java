package com.willgomes.learnjava.MyStore.Mappers;

import java.util.ArrayList;
import java.util.List;

import com.willgomes.learnjava.MyStore.Domains.Entities.Product;
import com.willgomes.learnjava.MyStore.Models.ProductViewModel;

import org.springframework.stereotype.Component;

/**
 * ProductMapper
 */
@Component
public class ProductMapper {

    public Product MappingProductViewModelToProduct(ProductViewModel productViewModel){
        Product product = new Product();
        if(productViewModel.getId() != null){
            product.setId(productViewModel.getId());
        }
        product.setName(productViewModel.getName());
        product.setCategory(productViewModel.getCategory());
        product.setBrand(productViewModel.getBrand());
        product.setDescription(productViewModel.getDescription());
        return product;
    }

    public ProductViewModel MappingProductToProductViewModel(Product product){
        ProductViewModel productViewModel = new ProductViewModel();

        productViewModel.setId(product.getId());
        productViewModel.setName(product.getName());
        productViewModel.setCategory(product.getCategory());
        productViewModel.setBrand(product.getBrand());
        productViewModel.setDescription(product.getDescription());

        return productViewModel;
    }

    public List<ProductViewModel> MappingProductToProductViewModelList(List<Product> products){
        
        List<ProductViewModel> productsViewModel = new ArrayList<ProductViewModel>();

        for (Product product : products) {
            productsViewModel.add(MappingProductToProductViewModel(product));
        }

        return productsViewModel;
    }

}