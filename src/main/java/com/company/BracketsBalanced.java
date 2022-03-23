package com.company;

import java.util.Stack;

public class BracketsBalanced {
    public static void main(String[] args) {
        String str = "}{{}}";
        System.out.print("String balanced:"+(isBracketsBalanced("}{{}}") ? "YES": "NO"));
        System.out.print("String balanced:"+(isBracketsBalanced("{{}}") ? "YES": "NO"));
        System.out.print("String balanced:"+(isBracketsBalanced("{{}(") ? "YES": "NO"));
        System.out.print("String balanced:"+(isBracketsBalanced("{()}") ? "YES": "NO"));
    }

    static boolean isBracketsBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(Character c :str.toCharArray()){
            if(c=='{' || c=='(' || c=='[') {
                stack.push(c);
            }
            //Implement else if
            else if(c==')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }
            else if(c=='}'){
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }
            else if(c==']'){
                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}
