/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp.tddassignment.service.Impl;

import com.karriem.tp.tddassignment.service.TDDService;

/**
 *
 * @author uchiha-clan
 */
public class TDDServiceImpl implements TDDService{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double floatNum(double no1, double no2) {
        
        return no1 + no2;
    }

    @Override
    public boolean integer(int i, int i0) {
        
        if (i == i0){
            
            return true;
        }
        else
            return false;
    }

    @Override
    public TDDService object() {
        
        return this;
    }

    @Override
    public boolean truth() {
        
        return true;
    }

    @Override
    public boolean falsity() {
       
        return false;
    }

    public TDDServiceImpl objectNull() {
        
        TDDServiceImpl ser = null;
        
        return ser;
    }

}
