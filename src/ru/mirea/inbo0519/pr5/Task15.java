package ru.mirea.inbo0519.pr5;

import java.util.Scanner;

public class Task15 {
    public static void recursion(int N)
    {
        if(N==0)
            return;
        System.out.print(N%10 + " ");
        recursion(N/10);

    }

    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        recursion(N);
    }
}
