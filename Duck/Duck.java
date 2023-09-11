package com.cps2232.week1;

public class Duck{
    String name;
    int location; //所处位置， 范围为0~12，起始点A为位置0，终点B为位置12

    public Duck() {
    }
    public Duck(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
