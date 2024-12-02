package com.github.mvlcak.day2;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.github.mvlcak.day2.Puzzle.INPUT;

public class Parser {
    public static String[][] parseInput() {
        BufferedReader bufReader = new BufferedReader(new StringReader(INPUT));
        List<String[]> lines = new ArrayList<>();
        String line;
        try {
            while ((line = bufReader.readLine()) != null) {
                String[] splitted = line.split(" ");
                lines.add(splitted);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines.toArray(new String[0][]);
    }

    public static List<LinkedList<String>> parseInputToLinkedList() {
        BufferedReader bufReader = new BufferedReader(new StringReader(com.github.mvlcak.day1.Puzzle.INPUT));
        List<LinkedList<String>> lines = new ArrayList<>();
        String line;
        try {
            while ((line = bufReader.readLine()) != null) {
                String[] splitted = line.split(" ");
                LinkedList<String> linkedList = new LinkedList<>();
                for (String s : splitted) {
                    linkedList.add(s);
                }
                lines.add(linkedList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines;
    }
}
