package com.example.algorithms;
import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class Migrate {

    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        int[][] b = new int[n][m];
        a = RandomInitial(a,n);//初始化二维数组
        for(int i = 0;i < a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
        b = MigrateArrays(a,b);
        for(int i = 0;i < b.length; i++){
            System.out.println(Arrays.toString(b[i]));
        }

    }

    private static int[][] MigrateArrays(int[][] a, int[][] b) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j ++){
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    private static int[][] RandomInitial(int[][] a, int n) {
        StdOut.println("初始化数组：");
        for(int i = 0;i < a.length;i++){
            for(int j = 0;j < a[i].length; j ++){
                a[i][j] = StdRandom.uniform(n);
            }
        }
        return a;
    }

    public static void MigratePrint(int[][] a){

    }


}
