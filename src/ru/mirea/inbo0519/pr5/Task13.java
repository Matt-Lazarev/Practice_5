package ru.mirea.inbo0519.pr5;

import java.util.Scanner;

public class Task13 {
    public static void recursion()
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0)
        {
            int num2 = scan.nextInt();
            System.out.println(num);
            if(num2>0)
                recursion();
        }
    }

    public static void main(String[] args)
    {
        recursion();
    }
}
