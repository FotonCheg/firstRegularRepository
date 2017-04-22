package com.dyachenko.Home.InternetShopLevelUP;

import java.util.Date;

/**
 * Created by 2017 on 21.04.2017.
 */
public class ProductCost {
    private int id;
    private int price;
    private Date startDate;
    private Date endDate;

    public ProductCost(){

    }

    public ProductCost(int id, int price, Date startDate, Date endDate){
        this.id = id;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
