package com.example.algorithms;

import java.util.Arrays;

public class ArrayBasicsAlgorithms {
    //数组
    //找出数组中最大的元素
    public static double max(double[] a){
        double max = a[0];
        for (int i = 1, j = a.length; i < j;i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }
    //计算数组元素的平均值
    public static double average(double[] a){
        int length = a.length;
        double sum = 0;
        for (int i = 0,j = a.length; i < j; i++) {
            sum+=a[i];
        }
        return  sum/length;
    }
    //复制数组
    public static double[] copy(double[] a) {
        int length = a.length;
        double[] newArray = new double[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = a[i];
        }
        return newArray;
    }
    //颠倒数组元素的顺序
    public static double[] perversion(double[] a){
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            double temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }
        return a;
    }
    //矩阵相乘（方阵）
    public static double[][] matrix(double[][] a,double[][] b){
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i<N;i++){
            for(int j = 0; j < N ; j++){
                for (int k = 0; k < N ; k++){
                    //计算行i和列j之间的乘积
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;

    }

    public static double[][] matrixStu(double[][] a,double[][] b){
        int N = a.length;
        double[][] c = new double[N][N];
        for(int i = 0;i < N; i++){
            for(int j = 0; j < N ; j++) {
                for (int k = 0; k < N; k++) {
                    if(b[k].length > j) c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
    //1.1.5 典型静态方法的实现
    //计算一个整数的绝对值
    public static int abs(int a ){
        return (a < 0) ? -a : a;
    }
    //计算一个浮点数的绝对值
    public static double abs(double a){
        return (a < 0.0) ? -a : a;
    }
    //判定一个数是否为素数
    public static boolean isPrime(int N){
        if(N < 2) return false;
        for (int i = 2; i*i <= N;i++) {
            if(N % i == 0) return false;
        }
        return true;
    }
    //计算平方根（牛顿迭代法）
    public static double sqrt(double c){
        if(c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }
    //计算直角三角形的斜边
    public static double hypotenuse(double a,double b){
        return Math.sqrt(a*a+b*b);
    }
    //计算调和级数
    public static double H(int N){
        double sum = 0.0;
        for(int i = 1;i <= N; i++)
            sum += 1.0/i;
        return sum;
    }



    public static void main(String[] args) {

        int[] array = {1,2,8,3,7,6};
//        System.out.println("数组中最大的元素"+max(array));
//        System.out.println("计算数组元素的平均值"+average(array));
//        System.out.println("复制数组"+ Arrays.toString(copy(array)));
//        System.out.println("颠倒数组元素的顺序"+ Arrays.toString(perversion(array)));
//        int N = 10;
//        double[][] a = new double[N][N];
//        double[][] b = new double[N][N];
//
//        for(int i=0;i < N; i++) {
//            for(int j = 0; j < N; j++) {
//                a[i][j] = 1.0;
//                b[i][j] = 2.0;
//            }
//        }
//        for(int i = 0;i<a.length;i++){
//            System.out.println( Arrays.toString(a[i]));
//        }
//        double[][] c = matrix(a,b);
//        for(int i = 0;i<c.length;i++){
//            System.out.println( Arrays.toString(b[i]));
//        }
        //记甲，乙，丙三位同学的 平时，期中，期末 成绩为矩阵A，
        //平时，期中，期末的成绩所占比例为 矩阵B，
        //这三位同学的语文总评成绩用矩阵C表示
//        double[][] a = { {80,70,75}, {90,70,80}, {60,80,90}};
//        double[][] b = { {0.3}, {0.3}, {0.4}};
//        double[][] c = matrixStu(a,b);
//        for(int i = 0;i<c.length;i++){
//            System.out.println( Arrays.toString(c[i]));
//        }

//        int a = 8;
//        System.out.println(isPrime(a));
//        System.out.println(hypotenuse(3,4));

//        System.out.println(Math.log(4));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
