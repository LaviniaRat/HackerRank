package com.lavinia.learn.lisasworkbook;

import java.util.ArrayList;
import java.util.List;

public class LisasWorkbook {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(10);

        System.out.println(workbook(n, k, list));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        int counter = 0;
        int page = 0;
        for (int i = 0; i < n; i++) {
            page += 1;
            for (int j = 1; j <= arr.get(i); j++) {
                if (j == page)
                    counter += 1;
                if (j % k == 0 && j != arr.get(i))
                    page += 1;
            }
        }
        return counter;

    }
}
