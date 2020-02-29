package com.willgomes.learnjava.MyStore.Controllers;

import java.util.ArrayList;
import java.util.List;

import com.willgomes.learnjava.MyStore.Models.ProductViewModel;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * ProductController
 */
@RestController
public class ProductController {

    @ApiResponses({ 
        @ApiResponse(code = 201, message = "Created"), 
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal Server Error") 
    })
    @PostMapping(value = "/products", produces = { "application/json" }, consumes = { "application/json" })
    public ResponseEntity<HttpStatus> Post(@RequestBody final ProductViewModel productViewModel) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ApiResponses({ 
        @ApiResponse(code = 200, message = "Ok"), 
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal Server Error") 
    })
    @GetMapping(value = "/products/{page}/{perPage}", produces = { "application/json" }, consumes = {
            "application/json" })
    public List<ProductViewModel> FindAll(@PathVariable final int page, @PathVariable final int perPage) {
        return new ArrayList<ProductViewModel>();
    }

    @ApiResponses({
        @ApiResponse(code = 200, message = "Ok"), 
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal Server Error") 
    })
    @GetMapping(value = "/products/{id}", produces = { "application/json" })
    public ProductViewModel FindOne(@PathVariable final int id) {
        return new ProductViewModel();
    }

    @ApiResponses({ 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal Server Error") 
    })
    @PutMapping(value = "/products/{id}", produces = { "application/json" }, consumes = { "application/json" })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void Put(@PathVariable final int id, @RequestBody final ProductViewModel productViewModel) {

    }

    @ApiResponses({ 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 500, message = "Internal Server Error") 
    })
    @DeleteMapping(value = "/products/{id}", produces = { "application/json" })
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void Delete(@PathVariable final int id) {

    }

}