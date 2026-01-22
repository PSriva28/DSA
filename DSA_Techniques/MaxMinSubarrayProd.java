package DSA_Techniques;

public class MaxMinSubarrayProd {
    public static void MaxSubarrayProduct(int nums[], int k){
        int prod = 1; //can't keep 0 cause it will return the product to 0 all the times;
        for(int i = 0; i<k;i++){
            prod = prod*nums[i];
        }
        int maxprod = prod; // 840 currently from 7*4*5*6
        for(int i =1;i<=nums.length-k;i++){
            prod = (prod*nums[i+k-1])/nums[i-1]; // next element muliply ho raha hai aur prev element divide.
            if(maxprod<prod){
                maxprod = prod;
            }
        }
        System.out.println("Maximum Product from the subarray = "+maxprod);


    }
    public static void MinSubarrayProduct(int nums[], int k){
        int prod = 1; //can't keep 0 cause it will return the product to 0 all the times;
        for(int i = 0; i<k;i++){
            prod = prod*nums[i];
        }
        int minprod = prod; // 840 currently from 7*4*5*6
        for(int i =1;i<=nums.length-k;i++){
            prod = (prod*nums[i+k-1])/nums[i-1]; // next element muliply ho raha hai aur prev element divide.
            if(minprod>prod){
                minprod = prod;
            }
        }
        System.out.println("Minimum Product from the subarray = "+minprod);


    }
    public static void main(String args[]){
        int nums[] = new int[]{7,4,5,6,9,5};
        int k = 4;
        MaxSubarrayProduct(nums, k);
        MinSubarrayProduct(nums, k);
    }
    
}
