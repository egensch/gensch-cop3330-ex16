/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner driving = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = driving.nextInt();

        String msg = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(msg);
    }
}
