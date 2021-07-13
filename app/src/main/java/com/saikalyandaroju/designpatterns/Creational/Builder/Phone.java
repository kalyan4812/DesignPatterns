package com.saikalyandaroju.designpatterns.Creational.Builder;

public class Phone {
    private String OS;
    private int ram;
    private String color;
    private long price;
    private double screenSize;
    public Phone(Builder builder){
        this.OS=builder.OS;
        this.ram=builder.ram;
        this.color=builder.color;
        this.price=builder.price;
        this.screenSize=builder.screenSize;

    }

    public String getOS() {
        return OS;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

    static class Builder{
        private String OS;
        private int ram;
        private String color;
        private long price;
        private double screenSize;


        public Builder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrice(long price) {
            this.price = price;
            return this;
        }

        public Builder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }
}
