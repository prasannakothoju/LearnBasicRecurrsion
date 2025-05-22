//printing 1 to N using recurrsion

public class A{
    
    public static void printnum(int n){
        if(n==0)return;
        printnum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        printnum(5);
    }
}
