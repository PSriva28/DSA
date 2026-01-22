public class ThreeSum15 {

    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int sum = 0;
        for(int i=0;i<3;i++){
            sum = sum+arr[i];
        }
        int requiresum = 0;
        if(sum==0){
            requiresum = sum;
        }
        for(int i=1;i<arr.length-3;i++){
            sum=sum+arr[i];
            if(sum==0){
                requiresum=sum;
            }
        }
        System.out.println(requiresum);
    }
}