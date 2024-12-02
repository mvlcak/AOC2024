package com.github.mvlcak.day2;

public class SolutionPartOne {
    public static void main(String[] args) {
        int safeCounter = 0;
        String[][] matrix = Parser.parseInput();
        for (int i = 0 ; i<matrix.length; i++) {
                Boolean isPreviousDecreasing = null;
            for (int j=1; j < matrix[i].length; j++){
                int current = Integer.parseInt(matrix[i][j]);
                int previous = Integer.parseInt(matrix[i][j-1]);
                if (isPreviousDecreasing != null){
                    if (current > previous){
                        if (isPreviousDecreasing.equals(true)){
                            break;
                        }
                    }
                    if (current < previous){
                        if (isPreviousDecreasing.equals(false)){
                            break;
                        }
                    }
                }
                isPreviousDecreasing = getPreviousDecreasing(current, previous, isPreviousDecreasing);
                int increase = getIncrease(current, previous);
                if (!((increase >= -3 && increase < 0) || (increase > 0 && increase <= 3))) {
                    break;
                }
                if (j == matrix[i].length - 1) {
                    safeCounter++;
                }
            }
        }
        System.out.println(safeCounter);
    }

    private static int getIncrease(int current, int previous) {
        return current - previous;
    }


    private static Boolean getPreviousDecreasing(int current, int previous, Boolean isPreviousDecreasing) {
        if (current > previous) {
            isPreviousDecreasing = false;
        } else if (current < previous) {
            isPreviousDecreasing = true;
        }
        return isPreviousDecreasing;
    }
}
