package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by Andrea on 14/01/2017.
 */

public class ShoppingList {
    private String listName;
    private String owner;

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getListName() {
        return listName;
    }

//    public String getOwner() {
//        return owner;
//    }

    public ShoppingList() {
    }
    public ShoppingList(String listName, String owner){
        this.listName = listName;
        this.owner = owner;
    }
}
