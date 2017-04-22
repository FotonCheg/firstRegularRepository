package com.dyachenko.Home.InternetShopLevelUP;

import java.util.Set;

/**
 * Created by 2017 on 21.04.2017.
 */
public class Product {
    private int id;
    private String name;
    private int count;
    private ProductDescription productDescription;

    private Set<Order> orderSet;
    private Set<Category> categorySet;
    private Set<ProductCost> productCostSet;
    private Set<ProductPrice> productPriceSet;

    public Product(){

    }

    public Product(int id, String name, int count, ProductDescription productDescription, Set<Order> orderSet, Set<Category> categorySet, Set<ProductCost> productCostSet, Set<ProductPrice> productPriceSet){
        this.id = id;
        this.name = name;
        this.count = count;
        this.productDescription = productDescription;
        this.orderSet = orderSet;
        this.categorySet = categorySet;
        this.productCostSet = productCostSet;
    }
}
