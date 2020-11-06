package com.company;

public class Phone {
    private double memory;
    private String brand;
    private String color;
    private boolean isVideoCamera;

    public Phone(double memory, String brand, String color, boolean isVideoCamera) {
        this.memory = memory;
        this.brand = brand;
        this.color = color;
        this.isVideoCamera = isVideoCamera;
    }

    public double getMemory() {
        return memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean isVideoCamera() {
        return isVideoCamera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                ", isVideoCamera=" + isVideoCamera +
                '}';
    }
}
