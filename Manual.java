package com.lab4ex1;

public class Manual extends Item implements Manager {
    private String edition;

    public Manual(String title, String path, String author, int year, String edition) {
        super(title, path, author, year);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
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
