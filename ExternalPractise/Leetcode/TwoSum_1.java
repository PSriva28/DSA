// 1.Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.*;
class TwoSum_1{
    //1-Brute force approach - will work on every sorted not sorted array.
    public static void BruteForce(int nums[], int target){
        for(int i =0;i<nums.length;i++)
            {
                for(int j=i+1; j<nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        // return new int[]{i,j};
                        System.out.println(i+" "+j);
                        return;
                        }
                    }
            }
            System.out.println("Not found any pair.");
        }

    //2-Two Pointer - which will work only sorted arrays
    public static void TwoPointer(int nums[], int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int currentsum = nums[left]+nums[right];
            if(currentsum==target){
                System.out.println(left+ " "+right);
                return;
            }
            else if(currentsum<target){
                left++;
            }
            else {
                right--;
            }
        }
    }
    
    //3- Using HashMap - no requirement of sort/unsort. 
    public static void HashMapTechnique(int nums[],int target){
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int need = target - nums[i];
            if(hs.containsKey(need)){
                // int newres[] =  new int[]{hs.get(need), i};
                System.out.print(hs.get(need) + " "+i);
                return;
            }
            hs.put(nums[need],i);
        }
        return;
    }
    public static void main(String args[]){
        int nums[] = {1,2,2,3,4,7,9};
        int target = 10;
        // BruteForce(nums, target);  
        TwoPointer(nums, target);  
        // HashMapTechnique(nums,target);
}

}
//Easy = Two Pointer Technique, for this array should be sorted. 