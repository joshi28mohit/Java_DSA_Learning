import java.util.Scanner;
public class LS_res{
    public static void main(String[] args){
        int[] arr = {1, 35, 542, 2, 44, 66};
        int target = 44;
        System.out.println(check(arr, 0, target));
    }

    static int check(int[] arr, int idx, int target){
        if(idx == arr.length - 1 && arr[idx] != target){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return check(arr, idx + 1, target);
    }

}