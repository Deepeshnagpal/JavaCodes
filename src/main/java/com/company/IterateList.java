package com.company;

import java.util.*;

public class IterateList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();



        //add 4 items in list

        list.add("Mango");
        list.add("Pineapple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        //simple for loop
        System.out.println("1. Simple for loop");

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        //new enhanced for loop
        for(String fruit : list){
            System.out.print(" "+ fruit);
        }

        //Iterator - returns an iterator over the elements in the list

        Iterator<String> fruitsList = list.iterator();
        while(fruitsList.hasNext()){
            System.out.println(fruitsList.next());
        }

        //ListIterator - traverse a list of elements in forward and backward direction

        ListIterator<String> listFruit = list.listIterator();
        while(listFruit.hasNext()){
            System.out.println("list fruits: "+ listFruit.next());
        }

        Set<String> set = new HashSet<String>(list);
        System.out.println("Set is :"+set);

    }
}
