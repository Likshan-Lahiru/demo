package com.example;

public class Student {
    
    private String name;
    
    private int age;

    private String address;

    public Student(){}//noargs cunsructor

    public Student(String name,int age,String address){ //fullargs cunsructor
            this.name = name;
            this.age = age;
            this.address = address;
    }
    public void setname(String name){
            this.name = name;
    }
    public String getname(){
        return name;
    }

    public void canWritten(){
        System.out.println("Can Written");
    }

    public void canRead(){
        System.out.println("Can Raed");
    }

}