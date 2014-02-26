/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.tp.tddassignment.service;

import com.karriem.tp.tddassignment.service.Impl.TDDServiceImpl;

/**
 *
 * @author uchiha-clan
 */
public interface TDDService {
    
    public int add(int a, int b);

    public double floatNum(double no1, double no2);

    public boolean integer(int i, int i0);

    public TDDService object();

    public boolean truth();

    public boolean falsity(); 

    public TDDServiceImpl objectNull();
    
}
