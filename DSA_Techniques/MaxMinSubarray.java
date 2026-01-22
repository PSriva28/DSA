package DSA_Techniques;
//Important thing to note that the size is given, and all elements are positive;

public class MaxMinSubarray {
    public static void maxSubarray(int nums[], int k){
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum+nums[i];
        }
        int maxsum = sum;
        System.out.print("The elements that form max sum are :- ");
        for(int i = 1;i<=nums.length-k;i++){
            sum = sum+nums[i+k-1] - nums[i-1]; // next element plus ho raha hai aur prev element minus hoga
            if(maxsum<sum){
                maxsum = sum;
                for(int j = i;j<=i+k-1;j++)
                {System.out.print(nums[j]+ " ");}
            }
        }
        System.out.println("The maximum sum is : "+ maxsum);
    }
    public static void minSubarray(int nums[], int k){
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum+nums[i];
        }
        int maxsum = sum;
        for(int i = 1;i<nums.length-k;i++){
            sum = sum+nums[i+k-1] - nums[i-1]; // next element plus ho raha hai aur prev element minus hoga
            if(maxsum>sum){
                maxsum = sum;
            }
        }
        System.out.println("The minimum sum is : "+ maxsum);
    }
    public static void main(String args[]){
        int nums[] = new int[]{7,5,6,5,8,2,7};
        int k = 3;
        maxSubarray(nums,k);
        minSubarray(nums,k);
    }
}
