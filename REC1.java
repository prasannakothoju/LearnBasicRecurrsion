//printing something for n times
import java.util.*;
import java.util.Scanner;

public class A {
public void justprint(int n ){

if(n==0) return;
System.out.println("Hey! prasanna");
justprint(n-1);
}

public static void main(String[] args){
justprint(5);
}
}
