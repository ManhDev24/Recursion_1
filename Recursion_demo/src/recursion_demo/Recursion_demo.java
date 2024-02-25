/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion_demo;

/**
 *
 * @author NC
 */
public class Recursion_demo {

    public static void main(String[] args) {
        //test factorial
        System.out.println(factorial(5));
        // testFibo
        System.out.println(testFibo(55));
        System.out.println(testFibo(144));
        System.out.println(testFibo(120));
        // test ap
        System.out.println("Test ap Demo 3");
        System.out.println(ap(6, 1.5, 2)); //11.5
        System.out.println("Test gp Demo 4");
        System.out.println(gp(6, 1.5, 2)); //48.0
        System.out.println("Test sum array Demo 5");
        double a[]= {1.5,2,4,5,2,6.5};
        System.out.println(sum(a, 6));
        System.out.println("Test max Demo 6");
        int b [] = {1,5,9,7,2,19,10};
        System.out.println(max(b, 7));
        System.out.println("Test min Demo 7");
        System.out.println(min(b, 7));
    }
    public static double factorial(int n){
        if(n<2) return 1;
        return n* factorial(n-1);
    }
    
    public static int fibo(int n){
        if(n<2) return 1;
        return fibo(n-2)+fibo(n-1);
    }
    
    // testong wjetjer x os om tje fibonanci sequence or not
    public static boolean testFibo(int x){
        if(x<1) return false;
        int aFibo =1;
        int n =2;
        while (aFibo<x) {            
            aFibo = fibo(n++);
        }
        return  x==aFibo;
    }
    public static double ap (int n , double a, double d){
        if(n<=1) return a;
        return ap(n-1, a, d) + d;
    }
    
        public static double gp(int n , double a, double q){
            if(n<=1) return a;
            return gp(n-1,a,q) *q;
        }
        
        
        public static double sum (double [] a , int n){
            if(n<1) return 0;
            return sum(a, n-1) + a[n-1];
        }
        public static int max (int [] a, int n){
            if(n==1) return a[0];
            int m = max(a, n-1);
            return m>a[n-1] ? m: a[n-1];
        
        }
            public static int min (int []a, int n){
                if(n==1) return a[0];
                int m =min(a, n-1);
                return m<a[n-1]? m:a[n-1];
            }
}