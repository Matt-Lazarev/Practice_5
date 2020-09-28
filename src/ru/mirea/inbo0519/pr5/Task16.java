package ru.mirea.inbo0519.pr5;

import java.util.Scanner;

public class Task16 {
    public static void recursion(int max, int count) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, ++count);
            }
            else {
                recursion(max, count);
            }
        } else {
            System.out.println("The max element in sequence: " + max);
            System.out.println("The amount of the max value in sequence: " + count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0);
    }
}
