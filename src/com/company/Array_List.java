package com.company;

import java.util.*;
import java.util.Arrays;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(10); l2.add(11); l2.add(12); l2.add(13); l2.add(14);
        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(0,5);

        l1.addAll(0,l2);

        System.out.println(l1.contains(4));
        System.out.println(l1.indexOf(156));
        l1.set(1,1448);

        System.out.println(l1.isEmpty());
        System.out.println(Arrays.toString(l1.toArray()));
        System.out.println(l1.subList(0,5));
//        l1.remove(5);
//        System.out.println(l1);
//        l1.clear();
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

//        Iterator<Integer> iterator = l1.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");


//        }
    }
}
