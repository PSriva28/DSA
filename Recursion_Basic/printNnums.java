//n = 5
//output = 1,2,3,4,5 print ho;
class SumofN1
{
    // 6->5->------
    public static void printnums(int n){
        if( n==0){ //*base condition
            return;
        }
        System.out.println(n);
        printnums(n-1); //2nd functio
        
    }
    // //1->2->----n
    public static void printNums2(int n){
        if(n==0){
            return;
        }
        printNums2(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n =6;
        System.out.println("1 TO N");
        printNums2(n);
        System.out.println("N to 1");
        printnums(n);
    }
}
//*base condition - if you miss condition, the function will never return and it will keep on calling and filling memory stack and it will reach to one point where the memory will be full resulting in exception of StackOverflow