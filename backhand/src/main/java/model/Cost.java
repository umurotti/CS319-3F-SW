/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author umur
 */
public class Cost {
        private HashMap<String,Integer> cost;

    public Cost(HashMap<String, Integer> cost) {
        this.cost = cost;
    }

    public Cost() {
    }

    public HashMap<String, Integer> getCost() {
        return cost;
    }
    
    public void setCost(HashMap<String, Integer> cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cost{" + "cost=" + cost + '}';
    }

}
