package com.cps2232.week1;

//8个方案，至少踏过3块石头，从A点到B点
public class DuckTest1 {
    public static void main(String[] args) {
        //创建一个Duck对象
        Duck duck1 = new Duck("duck001", 0);
        int loc = duck1.location;
        System.out.println(fib(loc));
    }

    public static int fib(int loc) {
        int temp = 0;
        while (loc >= 0 && loc <12) {
            if (loc == 0) {
                loc = 1;
            } else if (loc == 1) {
                loc = 2;
            } else if (loc >= 12) {
                //如果位置已经到了12，就返回值12
                loc = 12;
            } else {
                loc = fib(loc - 1) + fib(loc - 2);
            }
        }
        return loc;
    }
}



