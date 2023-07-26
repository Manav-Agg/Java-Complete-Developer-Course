package com.manav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
        List arrayList = new ArrayList();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add(10);
        arrayList.add(10.6);
        arrayList.add(10);
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList(2);

        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add("Hii");
        arrayList2.add("Bye");
        System.out.println(arrayList2);

        arrayList2.add(2, 45);
        System.out.println(arrayList2);

        arrayList2.set(2, 60);
        System.out.println(arrayList2);
        System.out.println(arrayList2.isEmpty());
        System.out.println(arrayList2.size());
        System.out.println(arrayList2.contains("hello"));

        System.out.println(arrayList2.get(4));

//        arrayList2.removeAll(arrayList);
        arrayList2.retainAll(arrayList);
        System.out.println(arrayList2);

//        for(int i = 0; i < arrayList2.size(); i++){
//            System.out.println(arrayList2.get(i));
//        }

//        for (Object i: arrayList2) {
//            System.out.println(i);
//        }

        Iterator i = arrayList2.iterator();
        while(i.hasNext()){
            Object obj = (Object) i.next();
            System.out.println(obj);
        }

        ArrayList<String> stringArrayList = new ArrayList<String>();
    }
}