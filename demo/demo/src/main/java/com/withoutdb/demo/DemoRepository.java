package com.withoutdb.demo;

import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class DemoRepository {
    private static List<Demo> list = new ArrayList<Demo>();
   static  {
    Demo d1= new Demo("venky","pass");
    Demo d2= new Demo("vicky","123");
    Demo d3= new Demo("venkat","333");
    list.add(d1);
    list.add(d2);
    list.add(d3);
    }

    public List<Demo> call(){
        return list;
    }
    public Demo call(int id){
            return list.get(id);
   }
    public void addData(Demo demo){
       list.add(demo);
    }
    public void delete(int id){
       if(!list.isEmpty()) {
           for(int i=id+1;i<list.size();i++)
               list.get(i).replaceId();
           list.remove(id);
       }
    }

    public List<Demo> update(int id, Demo demo){
        list.get(id).replace(demo);
       return list;
    }
}
