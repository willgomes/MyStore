package com.willgomes.learnjava.MyStore.Domains.Entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Product
 */
@Document(collection = "product")
public class Product {

    @Id
    private String _id;
    private String _name;
    private String _brand;
    private List<String> _category;
    private String _description;

    public String getName() {
        return _name;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public List<String> getCategory() {
        return _category;
    }

    public void setCategory(List<String> category) {
        this._category = category;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        this._brand = brand;
    }

    public void setName(String name) {
        this._name = name;
    }
}