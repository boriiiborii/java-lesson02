package kr.easw.lesson2;

import java.util.Random;

public class MultiplicationTableIteration {
    private static int[][] fixedMultiplicationTable = new int[][]{
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
            new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18},
            new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27},
            new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36},
            new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45},
            new int[]{6, 12, 18, 24, 30, 36, 42, 48, 54},
            new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63},
            new int[]{8, 16, 24, 32, 40, 48, 56, 64, 72},
            new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81}
    };

    private static final int CHECK_COUNT = 9;
    private static final Random random = new Random();
    private static int matchCounter = 0;

    public static void main(String[] args) {
        loopMultiplicationTable(random.nextInt(9) + 1);
        if (matchCounter == CHECK_COUNT) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
        }
    }

    private static void loopMultiplicationTable(int first) {
        for (int second = 1; second <= 9; second++) {
            matchMultiplicationTable(first, second, checkMultiplicationTable(first, second));
        }
    }

    private static int checkMultiplicationTable(int first, int second) {
        return first * second;
    }

    private static void matchMultiplicationTable(int first, int second, int result) {
        if (fixedMultiplicationTable[first - 1][second - 1] == result) {
            matchCounter++;
        }
    }
}
