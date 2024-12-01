package com.github.mvlcak.day1;

import java.util.concurrent.atomic.AtomicInteger;

public class SolutionPartTwo {
    public static void main(String[] args) {
        Parser.TwoLists twoLists = Parser.parseInput();
        AtomicInteger counter = new AtomicInteger();
        for (int i = 0; i < twoLists.leftSide().size(); i++) {
            int left = twoLists.leftSide().get(i);
            twoLists.rightSide().stream().filter(right -> left == right).forEach(counter::getAndAdd);
        }
        System.out.println(counter);
    }
}
