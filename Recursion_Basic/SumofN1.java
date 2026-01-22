class prinNnums{
    public static void printSum(int n, int i, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        System.out.println(sum);
        printSum(n,i+1,sum);

    }
    public static void main(String args[]){
        int n=7;
        printSum(n,0,0);
    }
}
//1+2+3+4+5+6+7