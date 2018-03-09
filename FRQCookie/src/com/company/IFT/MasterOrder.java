package com.company.IFT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaelszuminski on 3/8/18.
 */

public class MasterOrder {

    private List<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }

    public int getTotalBoxes(){
        return orders.size();
    }

//    public String printBoxes(){
//       return orders.forEach(System.out::println);
//    }

    public int removeVariety(String cookieVar){
        int cookieNum = 0;
        for(CookieOrder order : new ArrayList<CookieOrder>(orders)){
            if(order.getCookieBoxName().equals(cookieVar)){
                cookieNum += order.getNumBoxes();
                orders.remove(order);
            }
        }
        return cookieNum;
    }

    public List<CookieOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<CookieOrder> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        String result = "";
        for(CookieOrder o : orders){
            result += o.getCookieBoxName() +" - "+ o.getNumBoxes()+"\n";
        }
        return result;
    }
}
