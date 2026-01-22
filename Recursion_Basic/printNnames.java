class printNnames{
    public static void printName(int n){
        if(n==0){
            return;
        }
        String s = "Ashish";
        System.out.println(s);
        printName(n-1);

    }
    public static void main(String args[]){
        printName(3);
    }
}