package com.example.algorithms;

public class Gcd {
    //求最大公约数，辗转相除法  也叫欧几里得算法
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        if(a%b == 0) return b;
        int c = a - b;
        return gcd(b,c);
    }

    public static void main(String[] args) {
        System.out.println(gcd(888,10076));
    }

}