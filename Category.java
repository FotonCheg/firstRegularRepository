package com.dyachenko.Home.InternetShopLevelUP;

import java.util.Set;

/**
 * Created by 2017 on 21.04.2017.
 */
public class Category {
    private String name;

    private Set<Product> productSet;

    public Category(){

    }

    public Category(String name, Set<Product> productSet){
        this.name = name;
        this.productSet = productSet;
    }
}
