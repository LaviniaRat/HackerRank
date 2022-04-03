package com.lavinia.learn.queenattack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueenAttack {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q =3;
        List<List<Integer>> obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(5,5));
        obstacles.add(Arrays.asList(4,2));
        obstacles.add(Arrays.asList(2,3));


        System.out.println(queenAttack(n,k,r_q,c_q, obstacles));

    }

    private static int queenAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

        int counter = 0;
        // Count moves on column above current position
        for (int i = r_q - 2; i >= 0; i--) {
            if (isBlocked(i, c_q-1, obstacles)) {
                break;
            }
            counter++;
        }

        // Count moves on column above current position
        for (int i = r_q ; i < n; i++) {
            if (isBlocked(i, c_q-1, obstacles)) {
                break;
            }
            counter++;
        }


        //Count moves on row- left side of current position

        for(int i = c_q-2; i>=0; i--){
            if(isBlocked(r_q-1, i,obstacles)) {
                break;
            }
            counter++;
        }

        //Count moves on row- right side of current position

        for(int i = c_q; i<n; i++){
            if(isBlocked(r_q-1, i, obstacles)){
                break;
            }
            counter++;
        }

        //Count moves on second diagonal-right side
        int col =c_q;
        int row = r_q -2;
        int max = n-1;
        int min=0;
        while(row >= min && row <= max && col >= min && col<=max){
            if(isBlocked(row, col, obstacles)){
                break;
            }
            row--;
            col++;
            counter++;
        }

        //Count moves on second diagonal-left side
        col = c_q-2;
        row = r_q;
        while(row >= min && row <= max && col >= min && col<=max) {
            if (isBlocked(row, col, obstacles)) {
                break;
            }
            row++;
            col--;
            counter++;
        }

        //Count moves on first diagonal-left side
        col = c_q-2;
        row = r_q-2;
        while(row >= min && row <= max && col >= min && col<=max) {
            if (isBlocked(row, col, obstacles)) {
                break;
            }
            row--;
            col--;
            counter++;
        }

        //Count moves on first diagonal-left side
        col = c_q;
        row = r_q;
        while(row >= min && row <= max && col >= min && col<=max) {
            if (isBlocked(row, col, obstacles)) {
                break;
            }
            row++;
            col++;
            counter++;
        }
        return counter;
    }

    public static boolean isBlocked(int row, int col, List<List<Integer>> obstacles) {
        for (List<Integer> obstacle : obstacles) {
            if (obstacle.get(0) -1 == row  && obstacle.get(1) - 1 == col ) {
                return true;
            }
        }

        return false;
    }
}
