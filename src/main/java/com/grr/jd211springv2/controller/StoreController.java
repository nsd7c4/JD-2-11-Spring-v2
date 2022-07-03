package com.grr.jd211springv2.controller;

import com.grr.jd211springv2.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public String addItem(@RequestParam("id") ArrayList<Integer> id){
        return storeService.addItem(id);
    }

    @GetMapping(path = "/get")
    public String getItems(){
        return storeService.getItems();
    }

}
