package com.github.mvlcak.day1;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static com.github.mvlcak.day1.Puzzle.INPUT;

public class Parser {
    public static TwoLists parseInput() {
        BufferedReader bufReader = new BufferedReader(new StringReader(INPUT));
        String line = null;
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();
        try{
            while((line=bufReader.readLine()) != null)
            {
                String[] splitted = line.split(" {3}");
                leftSide.add(Integer.parseInt(splitted[0]));
                rightSide.add(Integer.parseInt(splitted[1]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        leftSide.sort(Integer::compareTo);
        rightSide.sort(Integer::compareTo);
        return new TwoLists(leftSide, rightSide);
    }

    public record TwoLists(List<Integer> leftSide, List<Integer> rightSide) {
    }
}
