package com.example.demoforfactory.service;

import com.example.demoforfactory.model.Item;

import java.util.List;

public interface ItemService {

    void create(Item item);
    List<Item> readAll();
    Item read(int id);
    void update(Item item, int id) throws Exception;
    boolean delete(int id);

}
