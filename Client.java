package com.dyachenko.Home.InternetShopLevelUP;

import java.util.Set;

/**
 * Created by 2017 on 21.04.2017.
 */
public class Client {
    private int id;
    private String name;
    private String phoneNumber;

    private Set<Order> orderSet;

    public Client(){
    }

    public Client(int id, String name, String phoneNumber, Set<Order> orderSet){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orderSet = orderSet;
    }

}
