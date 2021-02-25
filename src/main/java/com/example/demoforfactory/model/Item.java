package com.example.demoforfactory.model;

public class Item {

    private Integer id;
    private String name;
    private Integer count;
    private String sector;

    public Item() {
    }

    public Item(Integer id, String name, Integer count, String sector) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.sector = sector;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
