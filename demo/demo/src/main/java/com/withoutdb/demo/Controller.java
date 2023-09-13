package com.withoutdb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RequestMapping(value = "list")
@RestController
public class Controller {
    @Autowired
    DemoRepository repo;

    @GetMapping("/get")
    public List<Demo> getData(){
            return repo.call();
    }
    @GetMapping("/get/{id}")
    public Demo getData(@PathVariable int id){
        return repo.call(id-1);
    }

    @PostMapping("/add")
    public List<Demo> postData(@RequestBody Demo demo){
        repo.addData(demo);
        return repo.call();
    }
    @DeleteMapping("/delete/{id}")
    public List<Demo> deleteData(@PathVariable int id){
        if(id!=0)
            repo.delete(id-1);
        return repo.call();
    }
    @PutMapping("/update/{id}")
    public List<Demo> updateData(@PathVariable int id ,@RequestBody Demo demo){
        if(id!=0)
            repo.update(id-1,demo);
        return repo.call();
    }

}
