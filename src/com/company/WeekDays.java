package com.company;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum;
        System.out.println("Enter day of the week");
        dayNum = scanner.nextInt();

        switch (dayNum)
        {
            case 1:
                System.out.println("The 1st day of the week is Monday");break;
            case 2:
                System.out.println("The 2nd day of the week is Tuesday");break;
            case 3:
                System.out.println("The 3rd day of the week is Wednesday");break;
            case 4:
                System.out.println("The 4th day of the week is Thursday");break;
            case 5:
                System.out.println("The 5th day of the week is Friday");break;
            case 6:
                System.out.println("The 6th day of the week is Saturday");break;
            case 7:
                System.out.println("The 7th day of the week is Sunday");break;
            default:
                System.out.println("Not a day of the week!");
        }
    }

}
