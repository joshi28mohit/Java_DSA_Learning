import java.util.Scanner;
public class Palin{
    static int sum = 0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }

static boolean palin(int n){
    return n == sum;
}

public static void main(String[] args){
        rev(12344321);
        System.out.println(palin(12344321));
    }

    
}