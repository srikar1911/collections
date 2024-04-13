package practice;

import java.util.Scanner;

class Solution {
    public static int removeElement(int[] nums, int val) {

        int j = 1;
        for (int i = 1; i < nums.length; i ++){
            if(nums[i-1] == val){
                nums[i-1] = nums[j];
                j++;

            }

        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("length");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("val");
       int val =  scanner.nextInt();

        System.out.println(removeElement(nums, val));
        System.out.println(nums);
    }
}