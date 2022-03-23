package com.company;

import org.junit.Test;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        char ch = '0';
       testClass.testsmallfun();
    }


      public void testsmallfun(){
        String str = "Tutorials123";
            boolean flag = true;
        for(int i=0; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)==flag){
                System.out.println(ch + " is a number");
            }
            else{
                System.out.println(ch + " is a letter");
            }
        }
      }

      @Test
    public void testStringReplace(){
        String str = "Hello World ";
        String s = " Welcome to GeeksForgeeks ";
        str = str.replace('l', 'p');
        System.out.println("String:"+str);

        String newStr = s.replaceAll("(.*)Geeks(.*)" , "Deepesh").trim();
        System.out.println(newStr);
      }

      @Test
    public void substring(){
        String str = "Hello Deepesh";

        System.out.println("Begin index:"+str.substring(0,5));

        int startIndex = str.length();
          System.out.println("startIndex:"+startIndex);
            String s = String.valueOf(startIndex);

      }
}
