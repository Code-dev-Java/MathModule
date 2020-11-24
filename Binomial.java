package com.algebra.count;
import com.algebra.count.Factorial;

public class Binomial {
    public String a;// term 1
    public String b;//term 2 of the binomial
    public int n;//power to be raised to on the binomial
    public int t;//t th term
    private Factorial factorial;


    public String Expand(){
        //only to be printed till n==10
        int r=n;
        long bin_coeff=1;
        factorial = new Factorial();
        String  term ;
        String terms="";
        for(int i=0;i<=r;i++){
            bin_coeff=factorial.choose(n,i);
            term = String.format("%d * %s^%d %s^%d",bin_coeff,a,(n-i),b,i);
            terms = new StringBuilder().append(terms).append(term).append(" + ").toString();
        }
        String ret = String.format("(%s + %s)^%d = ",a,b,n);
        String ret1 = ret + terms;
        StringBuffer ret2 = new StringBuffer(ret1);
        ret2 = ret2.deleteCharAt(ret2.length()-2);
        String str = ret2.toString();
        return str;
    }
    public String term(){
        return null;
    }
}
