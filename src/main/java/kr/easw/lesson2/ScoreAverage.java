package kr.easw.lesson2;

import java.util.Scanner;

public class ScoreAverage {

    public static void main(String[] args) {
        double score = getAverageScore(new Scanner(System.in));
        System.out.printf("당신의 점수는 %.2f점 입니다.%n", score);
        System.out.printf("당신은 %s 등급 입니다.", estimateGrade(score));
    }

    private static double getAverageScore(Scanner scanner) {
        int count = 0;
        int totalScore = 0;
        while (true) {
            int inputScore = scanner.nextInt();
            if (inputScore == 0) {
                break;
            }
            totalScore += inputScore;
            count++;
        }
        if (count == 0) return 0; // 0으로 나누는 것을 방지
        return (double) totalScore / count;
    }

    private static String estimateGrade(double averageScore) {
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
}
