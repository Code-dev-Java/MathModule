package com.algebra.count;
public class Factorial {
   /* private int n;
    private int r;

    public Factorial(int n1,int r1){
        n=n1;
        r=r1;
    }
    public Factorial(int n1){
        n=n1;
    }
    public Factorial(){

    }*/

    public long fact(int f){
        long prod=1;
        for(int i=1;i<=f;i++){
            prod*=i;
        }
        return prod;
    }
    public long permute(int n, int r){
        long perm=1;
        perm = fact(n)/(fact(n-r));
        return perm;
    }

    public long choose(int n, int r){
        long cho=1;
        cho = fact(n)/(fact(n-r)*fact(r));
        return cho;
    }
}
