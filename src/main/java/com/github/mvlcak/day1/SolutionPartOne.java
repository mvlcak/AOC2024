package com.github.mvlcak.day1;

import static com.github.mvlcak.day1.Parser.parseInput;

public class SolutionPartOne {
    public static void main(String[] args) {
        Parser.TwoLists twoLists = parseInput();
        long distance = 0L;
        for (int i = 0; i < twoLists.leftSide().size(); i++) {
            int left = twoLists.leftSide().get(i);
            int right = twoLists.rightSide().get(i);
            distance += Math.abs(left - right);
        }
        System.out.println(distance);
    }
}
