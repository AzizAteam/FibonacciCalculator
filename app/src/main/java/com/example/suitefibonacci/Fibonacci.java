package com.example.suitefibonacci;

public class Fibonacci {

    static protected int fibo(int n)
    {
        if (n <= 1)
            return n;
        else
            return fibo(n-1) + fibo(n-2);
    }
}