package ExternalPractise.Leetcode;

public class reversePrefix2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        int index = word.indexOf(ch); //1- to find the first index of the letter ch
        if(index == -1) {System.out.println(word);return;} //1- if no index found then return

        char[] arr = word.toCharArray(); //2- converting the string word into character array arr
        int left = 0, right = index; //3- using the two pointer technique we will swap the elements and iteration will happen till the index of ch found
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left++;
            right --;
        }
        String rev = new String(arr);
        System.out.print(rev);
    }
}
