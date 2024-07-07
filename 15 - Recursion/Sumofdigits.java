import java.util.Scanner;
public class Sumofdigits{
    public static void main(String[] args){
        System.out.println(sum(1342));
    }

    static int sum(int n){
        if(n/10==0){
            return n;
        }
        return sum(n/10) + n%10;
    }   
}