package RecursiveFibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {

    public int fib(int n) {

        if(n==1 || n==2) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
    public RecursiveFibonacci() {

        System.out.println(fib(6));
    }
}
