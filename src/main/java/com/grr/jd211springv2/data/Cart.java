package com.grr.jd211springv2.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cart {
    private final Map<Integer, Integer> items = new HashMap<>();

    private final Map<Integer, String> itemCodes = Map.of(
            0, "Bread",
            1, "Tea",
            2, "Milk",
            3, "Coffee",
            4, "Beef"
    );

    public void addItems(List<Integer> id) {
        id.forEach((n) -> items.merge(n, 1, Integer::sum));
    }

    private String toStringWithName(Integer i) {
        return itemCodes.getOrDefault(i, i.toString()) + "=" + items.get(i);
    }

    @Override
    public String toString() {
        StringBuilder newS = new StringBuilder();
        newS.append("Cart{");
        newS.append("items={");
        items.forEach((k, v) -> {
            newS.append(toStringWithName(k));
            newS.append(", ");
        });
        newS.deleteCharAt(newS.length() - 1);
        newS.deleteCharAt(newS.length() - 1);
        newS.append("}}");
        return newS.toString();
    }

    public Cart() {

    }
}
