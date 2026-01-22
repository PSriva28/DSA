// 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
public class ProductofArrayExceptSelf238 {
    public static int[] bruteForce(int nums[]){
        int prod = 1;
        int result[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            prod=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                prod = prod*nums[j];}
                
            }
            result[i] = prod;
        }
        return result;
    }
    
    public static void optimal(int nums[]){
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int result[] = new int[nums.length];

        //calculating the prefix product - {1,1,2,6} for{1,2,3,4}
        prefix[0] = 1; //since there is nothing before the first/Oth element
        for(int i = 1;i<nums.length;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        //calculating the suffix product - {24,12,4,1} for {1,2,3,4}
        suffix[nums.length-1] = 1 ;// since there is nothing after the last element which n-1
        for(int i = nums.length-2; i >=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        //the resultant will be {24, 12,8,6}
        for(int i = 0; i<nums.length;i++){
            result[i] = prefix[i]*suffix[i];
        }
        // return result;
        //printing the array.
        for(int i = 0 ;i<nums.length;i++){
            System.out.print(result[i]+ " ");
        }

    }
    public static void main(String args[]){
        int nums[] = new int[]{4,8,3,4};
        bruteForce(nums); //cannot use this approach as it will take O(n2) time, when it is specially mentioned to bring it O(n);
        optimal(nums);
    }
    
}