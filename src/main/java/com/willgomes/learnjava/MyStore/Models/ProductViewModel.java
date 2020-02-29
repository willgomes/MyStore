package com.willgomes.learnjava.MyStore.Models;

import java.util.List;

/**
 * ProductViewModel
 */
public class ProductViewModel {

    private String _name;
    private String _brand;
    private List<String> _category;
    private String _description;

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(final String description) {
        this._description = description;
    }

    public List<String> getCategory() {
        return _category;
    }

    public void setCategory(final List<String> category) {
        this._category = category;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(final String brand) {
        this._brand = brand;
    }

    public void setName(final String name) {
        this._name = name;
    }
    
}