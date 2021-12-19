package com.example2.demo2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class mycontroller {
   
    List<custDetails> list= new ArrayList<>();

    @PostMapping("/addcustDetails")
    public response addP(@RequestBody custDetails p) {
        list.add(p);
        return new response("Customer Added", p);
      // return null;
    }

    @GetMapping("/getcustDetails")
    public response getcustDetails() {
        return new response("Customer Fetched", list);
    //   return null;
    }

    @GetMapping("/delete/{name}")
    public List<custDetails> delete(@PathVariable String name){
        for (custDetails c:list){
            if(c.name.equals(name)){
                list.remove(c);
                return list;
            }
        }
        return null;
    }

    @GetMapping("/sort")
    public List<custDetails> fetchSortList(){
        list.sort((a,b) -> {

        if(a.mobileNO < b.mobileNO){
            return -1;
        }
            return 0;
        });
        return list;
    }

   
	


}
    
