//checking whether given string is palindrome or not
import java.util.*;
import java.util.Scanner;

public class A{
    
    //creating a function for palindrome check
    
    public static boolean isPalindrome(String str, int start, int end){
        if(start>= end) return true; //it reached middle of the string
        if(str.charAt(start) != str.charAt(end) ) return false; //mismatch
        return isPalindrome(str, start+1, end-1); //recursive step
    }
    
    //main method
     public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       
       //removing all spaces and convert to uppercase to avoid case sensitive issues
       String newstring = input.replaceAll("//s","").toUpperCase();
       
       //Calls the recursive function
       if(isPalindrome(newstring,0,newstring.length()-1)){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not palindrome");
       }
    }
}


