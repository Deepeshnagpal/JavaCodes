package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListSet {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        List<String> lisB = new ArrayList<>();

        String s = "Deepesh is a good boy";

        List<String> list = null;

        ListIterator<String>iterator = null;
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Mango");
        fruitList.add("Pear");

        iterator = fruitList.listIterator(fruitList.size());
       // iterator.next();

        System.out.println("Reverse order:");

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println("Normal order:");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        lisB.add("Kiwi");
        lisB.addAll(fruitList);
        System.out.println("list B : "+lisB);

        lisB.removeAll(fruitList);
        System.out.println("List B after removeAll :"+lisB);

        list = new ArrayList<String>();
    }
}
