//printing n to 1 using recurrsion

import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void printnum(int n){
        if(n==0) return; //base condition
        
        System.out.println(n);
        printnum(n-1);
        
    }
    public static void main(String[] args){
        printnum(5);
    }
}
