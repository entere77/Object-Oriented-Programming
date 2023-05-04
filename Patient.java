package com.oop2020;
import java.util.Date;

public class Patient {
    private String name;
    private String s;
    public Patient(String name){
        this.name = name;
        this.s = getId();
    }
    public String getName(){ return name; }
    public String getId(){
        Date d = new Date();
        long t = d.getTime();
        return t + name;
    }
    public String toString(){
        return "Patient name: " + name + "id: " + s;
    }
}