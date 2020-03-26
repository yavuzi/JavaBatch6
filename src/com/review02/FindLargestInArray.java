package com.review02;

public class FindLargestInArray {

	public static void main(String[] args) {
		// find largest element from an array
		
		int[]nums= {200,30,-1,900,56,787};
		int max = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        System.out.println("Largest value:"+max);
	
		// find smallest element from an array
		
		int[]numbers= {200,30,-1,900,56,787};
		int min = numbers[0];
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]<min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest value:"+min);

	}

}
