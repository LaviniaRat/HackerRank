package com.lavinia.learn.thetimeinwords;

import java.util.ArrayList;
import java.util.List;

public class TheTimeInWords {
    public static void main(String[] args) {
        int h = 12;
        int m = 55;
        System.out.println(timeInWords(h, m));

    }

    public static String timeInWords(int h, int m) {
        List<String> minlist = new ArrayList<>();
        minlist.add("zero");
        minlist.add("one");
        minlist.add("two");
        minlist.add("three");
        minlist.add("four");
        minlist.add("five");
        minlist.add("six");
        minlist.add("seven");
        minlist.add("eight");
        minlist.add("nine");
        minlist.add("ten");
        minlist.add("eleven");
        minlist.add("twelve");
        minlist.add("thirteen");
        minlist.add("fourteen");
        minlist.add("fifteen");
        minlist.add("sixteen");
        minlist.add("seventeen");
        minlist.add("eighteen");
        minlist.add("nineteen");
        minlist.add("twenty");
        minlist.add("twenty one");
        minlist.add("twenty two");
        minlist.add("twenty three");
        minlist.add("twenty four");
        minlist.add("twenty five");
        minlist.add("twenty six");
        minlist.add("twenty seven");
        minlist.add("twenty eight");
        minlist.add("twenty nine");

        String result = "";
        if (m == 0) {
            result = "" + minlist.get(h) + " " + "o' clock";
        } else if (m == 15) {
            result = "quarter past " + minlist.get(h);
        } else if (m > 0 && m < 10) {
            result = "" + minlist.get(m) + " minute past " + minlist.get(h);
        } else if (m >= 10 && m < 15) {
            result = "" + minlist.get(m) + " minutes past " + minlist.get(h);
        } else if (m > 15 && m < 30) {
            result = "" + minlist.get(m) + " minutes past " + minlist.get(h);
        } else if (m == 30) {
            result = "half past " + minlist.get(h);
        } else if (m > 30 && m < 45) {
            result = "" + minlist.get((60 - m)) + " minutes to " + minlist.get(h + 1);
        } else if (m == 45) {
            result = "quarter to " + minlist.get(h + 1);
        } else if (m > 45 && m < 60) {
            result = "" + minlist.get((60 - m)) + " minutes to " + minlist.get(h + 1);
        }
        return result;
    }

}
