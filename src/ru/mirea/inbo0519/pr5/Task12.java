package ru.mirea.inbo0519.pr5;

import java.util.Scanner;

public class Task12 {
    public static void recursion()
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0)
        {
            if((num&1) == 1)
                System.out.print(num + " ");
            recursion();
        }
    }

    public static void main(String[] args)
    {
        recursion();
    }
}
