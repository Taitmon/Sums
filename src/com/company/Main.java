package com.company;

public class Main
{

    public static void main(String[] args)
    {

        int v1 = 4;
        int v2 = 6;
        printSum(v1,v2);
        v1 = 7;
        v2 = 2;
        printSum(v1,v2);
    }

    private  static  void printSum(int v1, int v2)
    {
        System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
    }
}
