package ExternalPractise.Leetcode;

import java.util.Stack;

//71. question of leetcode
//eg1 - path = "/home/"
//output - "/home"
//edge cases to consider "///", ".", ".." and like these
public class StacksimplifyPath71 {
    public static void main(String[] args) {
        String s = "/a/../../b/../c//.//";

        String str[] = s.split("/"); //1- split the string
 
        

        Stack<String> stack = new Stack<>(); //2- initialize a stack
    
        for(int i = 0;i<str.length;i++){ //3- iterate through each word in the string array, taking care of the special edge cases
            if(str[i].equals(".") || str[i].equals("...") || str[i].equals("")){
                continue; //no need to push these
            }
            else if(str[i].equals("..")){
                if(!stack.isEmpty())
                {stack.pop();}
                continue;
            }
            else
            { stack.push(str[i]); }//before pushing we need to take care of the eddges cases
        }

        StringBuilder sb = new StringBuilder("/"); //4- converting the stack into string, we can be done with multiple methods, collections, streams, etc;
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
            if(i < stack.size() - 1) {
                sb.append("/");
            }
        }
        System.out.println(sb.toString());
    }
}
