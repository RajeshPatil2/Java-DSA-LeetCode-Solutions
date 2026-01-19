package com.dsa.array;

import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int numRows = 5;
        List<List<Integer>> result = sol.generate(numRows);

        System.out.println("Input numRows = " + numRows);
        System.out.println("Pascal's Triangle:");
        System.out.println(result);
    }
}

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // first and last element is always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
