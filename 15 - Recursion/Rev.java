import java.util.Scanner;
public class Rev{
public static void main(String[] args){
        System.out.println(1824);
        System.out.println(rev(1357));
    }

    static int rev(int n){
        return 10*rev(n/10) + n%10;
    }
}