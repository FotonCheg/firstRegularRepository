package com.dyachenko.Home.InternetShopLevelUP;

import com.dyachenko.Home.InternetShop.Product;

import java.util.Date;
import java.util.Set;

/**
 * Created by 2017 on 21.04.2017.
 */
public class Order {
    private int id;
    private Date date;
    private Set<Product> productSet;

    public Order(){}

    public Order(int id, Date date, Set<Product> productSet){
        this.id = id;
        this.date = date;
        this.productSet = productSet;
    }
}
