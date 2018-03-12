package com.lab4ex1;

public interface Manager {
    void add(Item item);
    void list();
    void open();
    void save(String path);
    void load(String path);
}
