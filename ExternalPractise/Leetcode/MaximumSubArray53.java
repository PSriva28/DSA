public class MaximumSubArray53 {
    public static void bruteForce(int nums[]){
        int maxsum=0;
        for(int i = 0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum = sum+nums[j];
                    maxsum = Math.max(sum,maxsum);
            }
        }
        System.out.println(maxsum);

    }
    
    
    //2- most optimized Kadane's Algorithm
    public static void Kadane(int nums[]){
        int maxsum = 0;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum= currsum+nums[i];
            maxsum = Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int nums[] = {4,-2,9,-1,7,3,6,-2};
        bruteForce(nums);
        Kadane(nums);
    }
}
