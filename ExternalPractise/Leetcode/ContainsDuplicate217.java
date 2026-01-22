// 217. Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

// Example 2:
// Input: nums = [1,2,3,4]
// Output: false
// Explanation:
// All elements are distinct.

// Example 3:
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

import java.util.HashMap;

public class ContainsDuplicate217 {
    //1-Brute force approach - will work on every sorted not sorted array.
    public static boolean BruteForce(int nums[]){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //2-Two Pointer - which will work only sorted arrays
    public static void TwoPointer(int nums[]){
        //adjacent element ko match karege two pointer se aur fir ye sorted mai isliye kr skate hai 
        int left = 0;
        int right = 1;
        if(nums.length<=1){
            System.out.println("Only one element or no element is present");
            return;
        }
        while(right<nums.length){
            if(nums[left] == nums[right]){
                System.out.println("true");
                return;
            }
            right++;left++;
        }
        System.out.println("false");
    }
    
    //3- Using HashMap - no requirement of sort/unsort. 
    public static boolean HashMapTechnique(int nums[]){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                return true;
            }
            hs.put(nums[i], 1);
            // return false;
        }
        System.out.println("False");
        return false;
    }
    public static void main(String args[]){
        int nums[] = {2,7,11,15,2};
        BruteForce(nums);
        System.out.println(BruteForce(nums));
        // TwoPointer(nums);
        // HashMapTechnique(nums);
    
}
}
