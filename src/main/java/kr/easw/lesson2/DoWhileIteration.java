package kr.easw.lesson2;

import java.util.Random;
import java.util.Scanner;

public class DoWhileIteration {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final int TARGET_VALUE = 21;
    private static int currentValue = 0;

    public static void main(String[] args) {
        System.out.println("블랙잭 게임을 시작합니다.");
        checkValue();
        if (currentValue > TARGET_VALUE) {
            System.out.println("최종 점수: 0");
            System.out.println("패배했습니다.");
        } else {
            System.out.println("최종 점수: " + currentValue);
        }
    }

    private static void checkValue() {
        do {
            increaseValue();
            System.out.println("현재 점수: " + currentValue);
            if (currentValue >= TARGET_VALUE) {
                break;
            }
        } while (!stopGame());
    }

    public static boolean stopGame() {
        if (TARGET_VALUE <= currentValue)
            return true;
        String nextValue = null;
        while (true) {
            System.out.print("계속 하시겠습니까? (Y / N) : ");
            String input = scanner.next();
            if ("Y".equalsIgnoreCase(input) || "N".equalsIgnoreCase(input)) {
                nextValue = input;
                break;
            }
            System.out.println("Y 또는 N을 입력해주세요.");
        }
        return "N".equalsIgnoreCase(nextValue);
    }

    private static void increaseValue() {
        currentValue += random.nextInt(10) + 1;
    }
}
