package com.lavinia.learn.servicelane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        ar1.add(2);
        ar1.add(3);
        list.add(ar1);
        List<Integer> ar2 = new ArrayList<>();
        ar2.add(4);
        ar2.add(6);
        list.add(ar2);
        List<Integer> ar3 = new ArrayList<>();
        ar3.add(6);
        list.add(ar3);
        List<Integer> ar4 = new ArrayList<>();
        ar4.add(3);
        ar4.add(5);
        list.add(ar4);
        List<Integer> ar5 = new ArrayList<>();
        ar5.add(0);
        ar5.add(7);
       list.add(ar5);
        List<Integer> width = new ArrayList<>();
        width.add(2);
        width.add(3);
        width.add(1);
        width.add(2);
        width.add(3);
        width.add(2);
        width.add(3);
        width.add(3);
        System.out.println(serviceLane(width,list));

    }

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases ){
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int entry = 0;
        int exit = 0;
        for(int i = 0; i < cases.size(); i++) {
            entry = cases.get(i).get(0);
            exit = cases.get(i).get(1);
            if (exit != width.size() - 1) {
                temp.addAll(width.subList(entry, exit + 1));
            } else {
                temp.addAll(width.subList(entry, exit));
                temp.add(width.get(width.size() - 1));

            }
            Collections.sort(temp);
            result.add(temp.get(0));
            temp.clear();
        }
        return result;
     }
}