package com.lab4ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Article extends Item implements Manager {
    private String conference;
    private List<Item> items = new ArrayList<>();

    public Article(String title, String path, String author, int year, String conference) {
        super(title, path, author, year);
        this.conference = conference;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public void add(Item item){
        items.add(item);
    }

    public void list(){
        System.out.println("Informatiile din catalog sunt : \n");
        for(Item parametru: items){
            System.out.println(parametru);
        }
    }

    public void open(){

    }

    public void save(String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            MyException exception = new MyException("Fisierul nu a fost gasit");
            System.out.println(exception.getMessage());
        }
    }

    public void load(String path){

    }
}
