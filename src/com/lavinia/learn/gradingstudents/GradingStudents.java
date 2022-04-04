package com.lavinia.learn.gradingstudents;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(80);
        list.add(96);
        list.add(18);
        list.add(75);
        list.add(80);
        list.add(60);
        list.add(60);
        list.add(15);
        list.add(45);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int x = 0;
        int newgrade = 0;
        List<Integer> newlist = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                if (grades.get(i) % 5 != 0) {
                    x = grades.get(i) / 5;
                    newgrade = 5 * (x + 1);
                    if (newgrade - grades.get(i) < 3) {
                        newgrade = 5 * (x + 1);
                    } else {
                        newgrade = grades.get(i);
                    }
                } else {
                    newgrade = grades.get(i);
                }
            } else {
                newgrade = grades.get(i);
            }
            newlist.add(newgrade);
        }
        return newlist;
    }

}