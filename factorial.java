import java.util.*;
import java.util.Scanner;

public class A {
    
    public static int fact(int n)
    {
        int ans = 1;
        for(int i=1; i<=n ;i++){
             ans = ans *i;
            
        }
        return ans;
    }
    
    public static void main(String[] args){
        int x = 5;
        int res = fact(5);
        System.out.println("Factorial of a given num is:"+res);
    }
}
