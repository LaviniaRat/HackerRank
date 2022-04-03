package com.lavinia.learn.minimumdistance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinimumDistance {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);
        System.out.println(minimumDistance(list));
    }

    public static int minimumDistance(List<Integer> a) {
        int minDistance = Integer.MAX_VALUE;
        int x = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j))) {
                    x = Math.abs(j - i);
                    if (x < minDistance) {
                        minDistance = x;
                    }
                }
            }
        }
        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minDistance;
        }
    }
}
