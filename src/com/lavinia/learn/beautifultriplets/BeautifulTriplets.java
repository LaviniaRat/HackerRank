package com.lavinia.learn.beautifultriplets;

import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);

        System.out.println(beautifulTriplets(n, list));
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        for (Integer v : arr) {
            if (arr.contains((v + d)) && arr.contains((v + 2 * d)))
                count++;
        }
        return count;
    }
}
