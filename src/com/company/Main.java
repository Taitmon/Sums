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
        printStudentStatus(true);
        printStudentStatus(false);

        int a = 7;
        int b = 7;
        int c = 7;
        int d = 7;
        int e = 7;
        printTotal(a, b, c, d, e);
        a = 2;
        c = 2;
        e = 2;
        printTotal(a, b, c, d, e);
    }

    private  static  void printSum(int v1, int v2)
    {
        System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
    }

    private static void printStudentStatus(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }

    private static void printTotal(int a, int b, int c, int d, int e)
    {
        System.out.println(a + b + c + d + e);
    }
}
