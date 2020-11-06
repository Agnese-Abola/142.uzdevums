package com.company;

public class ButtonPhone extends Phone {
    private boolean isFolding;

    public ButtonPhone(double memory, String brand, String color, boolean isVideoCamera, boolean isFolding) {
        super(memory, brand, color, isVideoCamera);
        this.isFolding = isFolding;
    }

    public boolean isFolding() {
        return isFolding;
    }
}
