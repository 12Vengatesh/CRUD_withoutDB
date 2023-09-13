package com.withoutdb.demo;


import org.springframework.boot.context.properties.bind.DefaultValue;

public class Demo {
    private int id;
    private String name;
    private String password;
    public static int count=0;

    public Demo( String name, String password) {
        count++;
        this.id = count;
        this.name = name;
        this.password = password;
    }
    public void replace(Demo demo){
        if(demo.name!=null)
        this.name = demo.name;
        if(demo.password!=null)
        this.password = demo.password;
    }
    public void replaceId(){
        this.id=this.id-1;
        count--;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
