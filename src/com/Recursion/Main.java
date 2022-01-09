package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Recursion intro:
        print(1);

    }
    public static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
// return is used to express a base condition where our recursion will stop making calls.