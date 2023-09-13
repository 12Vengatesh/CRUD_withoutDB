package com.withoutdb.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service {
    @Autowired
    List list ;
    public List get(){
       if(!list.isEmpty())
           return list;
       return list=null;
    }
    public void add(){

    }
    public void delete(){

    }
    public void update(){

    }
}
