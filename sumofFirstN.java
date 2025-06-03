import java.util.*;
import java.util.Scanner;

public class A{
    
    public static void sumof(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println("The sum is:"+sum);
    }
    
    public static void main(String[] args){
        sumof(5);
    }
}
