package com.grr.jd211springv2.service;

import com.grr.jd211springv2.data.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Map;

@Service
@SessionScope
public class StoreService{

    private Cart cart = new Cart();


    public String addItem(ArrayList<Integer> id){
        cart.addItems(id);
        return id.toString();
    }

    public String getItems() {
        return cart.toString();
    }
}
