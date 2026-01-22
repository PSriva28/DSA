import java.util.Arrays;
public class MissingNumber268 {
    public static void main(String[] args) {
        int nums[] = {1,2};
        Arrays.sort(nums);
        int missing = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                System.out.println("hi");
                missing= i;
            }
            if(i>nums.length){
                System.out.println("bye");
                missing = i+1;
            }
        }
        System.out.println(missing);
    }
}
