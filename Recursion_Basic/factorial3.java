class factorial3
{
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int a= fact(n-1);
        int factorial = n*a;
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String args[]){
        int n = 6;
        int res = fact(n);
        System.out.println("The factorial of n = "+res);
    }
}