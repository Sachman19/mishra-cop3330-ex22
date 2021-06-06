/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[3];

        System.out.print("Enter the first number. ");
        num[0] = input.nextInt();

        System.out.print("Enter the second number. ");
        num[1] = input.nextInt();

        System.out.print("Enter the third number. ");
        num[2] = input.nextInt();

        int largestNum = -1;
        if((num[0] > num[1]) && (num[0] > num[2])) largestNum = 0;
        else if((num[1] > num[0]) && (num[1] > num[2])) largestNum = 1;
        else if((num[2] > num[0]) && (num[2] > num[1])) largestNum = 2;
        else System.exit(largestNum);

        System.out.printf("The largest number is %d.", num[largestNum]);
    }
}