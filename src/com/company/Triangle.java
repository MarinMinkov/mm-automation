package com.company;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angleA,angleB,angleC;
        System.out.println("Enter value for angle A: ");
        angleA = scanner.nextInt();
        System.out.println("Enter value for angle B: ");
        angleB = scanner.nextInt();
        System.out.println("Enter value for angle C: ");
        angleC = scanner.nextInt();

        if (angleA+angleB+angleC == 180)
        {
            System.out.println("This is a possible triangle");
        }
        else
        {
            System.out.println("This is not a possible triangle");
        }

        if (angleA == 90 || angleB == 90 || angleC == 90)
        {
            System.out.println("Right triangle");
        }
        if (angleA < 90 || angleB < 90 || angleC < 90)
        {

        }
    }



}
