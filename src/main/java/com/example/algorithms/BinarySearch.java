package com.example.algorithms;

import edu.princeton.cs.algs4.*;


import java.util.Arrays;


public class BinarySearch {

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }
    public static void main(String[] args) {
//        int[] whitelist =

//        System.out.println((0+15)/2);
//        System.out.println(2.0e-6 * 100000000.1);
//        System.out.println(true && false || true && true);
//        System.out.println((1+2.236)/2);
//        System.out.println(1+2+3+4.0);
//        System.out.println(4.1 >= 4);
//        System.out.println(1+2.0+"3");

//        int a,b,c;
//        StdOut.println("请输入a,b,c");
//        a=StdIn.readInt();
//        b=StdIn.readInt();
//        c=StdIn.readInt();
//        if(a == b && b == c)
//            StdOut.print("equal");
//        else
//            StdOut.print("not equal");
//        double t = 9.0;
//        while (Math.abs(t - 9.0/t) > .001)
//            t = (9.0/t + t) / 2.0;
//        StdOut.printf("%.5\n",t);
//        System.out.println('b');
//        System.out.println('b'+'c');
//        System.out.println((char)('a'+4));
//        System.out.println('a'+4);
//        int[] a = new int[10];
//        for(int i=0;i<10;i++){
//            a[i] = i * i;
//        }

    }
}
