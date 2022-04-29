package com;

public class Test {
    public static void main(String[] args) {
        Solution  solution=new Solution();
        int[] nums={3,1,2,4};
        int[] ints = solution.sortArrayByParity(nums);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length=nums.length;
        int ou=0;
        int []  nowNums=new int[length];
        for(int i=0;i<length;i++){
            if(nums[i]%2==0){
               ou++;
            }
        }
        int h=ou;
        int j=0;
        for(int i=0;i<length;i++){
            if(nums[i]%2==0){
                nowNums[j++]=nums[i];
            }
            else{
                nowNums[h++]=nums[i];
            }
        }

        return nowNums;
    }
}
