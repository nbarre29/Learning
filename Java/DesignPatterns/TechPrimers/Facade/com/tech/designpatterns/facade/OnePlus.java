package com.tech.designpatterns.facade;

public class OnePlus implements Phone {
    @Override
    public String build() {
        return "Built using Android 4.0";
    }
}
