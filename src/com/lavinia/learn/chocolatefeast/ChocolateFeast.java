package com.lavinia.learn.chocolatefeast;

public class ChocolateFeast {
    public static void main(String[] args) {
        int n = 6;
        int c = 2;
        int m = 2;
        System.out.println(chocolateFeast(n, c, m));

    }

    public static int chocolateFeast(int n, int c, int m) {
        int wrap = n / c;
        int count = n / c + wrap / m;
        while (wrap >= m) {
            wrap = wrap / m + wrap % m;
            count = count + wrap / m;
        }
        return count;
    }

}


