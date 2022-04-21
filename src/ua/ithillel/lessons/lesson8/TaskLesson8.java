package ua.ithillel.lessons.lesson8;

import java.util.Arrays;

public class TaskLesson8 {
    public static void main(String[] args) {
        int n = 8;
        int[] fibonacciNumbers = new int[n+1];

        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (i == 0) {
                fibonacciNumbers[i] = 0;
            }
            else {
                if (i == 1){
                    fibonacciNumbers[i] = 1;
                }
                else {
                    fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
                }
            }
        }
        System.out.printf("Fibonacci number, F(%s) is %s\n", n, fibonacciNumbers[fibonacciNumbers.length-1]);
        System.out.println("Sequence of Fibonacci numbers: " + Arrays.toString(fibonacciNumbers));
    }
}
