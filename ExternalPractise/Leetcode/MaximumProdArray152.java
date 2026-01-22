// Given an integer array nums, find a subarray that has the largest product, and return the product.
// The test cases are generated so that the answer will fit in a 32-bit integer.
// Note that the product of an array with a single element is the value of that element.

// Example 1:
// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.

// Example 2:
// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
public class MaximumProdArray152 {
    public static int MaximumProdArray(int nums[]){
        int maxprod = 1;
        int prod = 1;
        //left to right
        for(int i= 0;i<nums.length;i++){
            prod= prod*nums[i];
            if(maxprod<prod){
                maxprod = prod;
            }
            if(prod==0 ){
                prod=1;
            }
        }
        //right to left
        prod = 1;
        for(int i=nums.length-1;i>=0;i--){
            prod = nums[i]*prod;
            if(maxprod<prod){
                maxprod = prod;
            }
            if(prod==0 ){
                prod=1;
            }

        }
        return maxprod;

    }

    public static void main(String args[]){
        int nums[] = {2,3,-2,4};
        int result = MaximumProdArray(nums);
        System.out.print(result);
    }
    
}
//Note :- 
//No sliding window cause no condition or fxed size of the window is given
// cannot use Kadane directly due to the influence of -ve integers

