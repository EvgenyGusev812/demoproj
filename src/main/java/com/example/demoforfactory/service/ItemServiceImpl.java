package com.example.demoforfactory.service;

import com.example.demoforfactory.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ItemServiceImpl implements ItemService{

   List<Item> items = new ArrayList<>();
   //private static int COUNT = 0;
    @Override
    public void create(Item item) {
        items.add(item);
    }

    @Override
    public List<Item> readAll() {
        return items;
    }

    @Override
    public Item read(int id) {
        return items.get(id);
    }

    @Override
    public void update(Item item, int id) throws Exception{
        items.get(id).setName(item.getName());
        items.get(id).setSector(item.getSector());
        items.get(id).setCount(item.getCount());
        items.get(id).setId(item.getId());
    }

    @Override
    public boolean delete(int id) {
        return items.remove(id) != null;
    }
}
