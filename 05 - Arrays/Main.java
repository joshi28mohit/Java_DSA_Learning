import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //Store a roll number:
        int rno = 01;

        //Store a name:
        String name = "Mohit";

        // Store 500 roll numbers:
        int rno1 = 02;
        int rno2 = 03;
        int rno3 = 04;
        int rno2 = 05;
        int rno3 = 06;

        //This is not the right method, we have arrays for that.

        //syntax
        // datatype[] variable_name = new datatype[size];

        // int[] roll_nos = new int[5];
        // or directly
        // int [] rnos = {1, 2, 3, 4, 5, 6};

        int[] rnos;  //Declaration: Array is getting defined in the stack.
        rnos = new int[5];  //initialisation: actually here the object is getting created inside the heap. 

        


    }




/*
-  🔄 Reversing an array using the two-pointer method involves swapping elements at the start and end, gradually moving towards the center until they meet.
-  🔄 The loop for array reversal continues until the start pointer is less than the end pointer, ensuring all elements are correctly swapped.
-  🔄 The two-pointer method works for arrays of both even and odd lengths, providing an efficient way to reverse the array elements.
-  🤓 The two-pointer method is a foundational concept for more advanced array manipulations, such as rotation, Armstrong numbers, and palindromic arrays.
-  🔗 Future sessions will delve into solving array-related questions, exploring topics like array rotation, Armstrong numbers, palindromic arrays, and more.
*/
}