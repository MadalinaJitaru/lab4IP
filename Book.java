package com.lab4ex1;

public class Book extends Item implements Manager {
    private String publisher;

    public Book(String title, String path, String author, int year, String publisher) {
        super(title, path, author, year);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void add(Item item){

    }
    public void list(){

    }
    public void open(){

    }
    public void save(String path){

    }
    public void load(String path){

    }
}
