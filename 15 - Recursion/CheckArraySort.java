import java.util.Scanner;
public class CheckArraySort{
    public static void main(String[] args){
        int[] nums = {1, 2, 9, 5, 7, 8, 99};
        System.out.println(sorted(0, nums));
    }

    static boolean sorted(int currIdx, int[] nums){
        if(currIdx == nums.length - 1){
            return true;
        }
        if(nums[currIdx] > nums[currIdx+1]){
            return false;
        }
        return sorted(currIdx + 1, nums);
    }
    
}