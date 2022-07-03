package com.grr.jd211springv2.service;

import com.grr.jd211springv2.data.Cart;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class StoreService{

    private final Cart cart = new Cart();


    public String addItem(List<Integer> id){
        cart.addItems(id);
        return id.toString();
    }

    public String getItems() {
        return cart.toString();
    }
}
