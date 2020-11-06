package com.company;

public class Main {

    public static void main(String[] args) {

        var smartPhone = new SmartPhone(256, "Samsung", "Black", true, true, true);
        System.out.println(smartPhone.getBrand() + ", color " + smartPhone.getColor());


    }
}
