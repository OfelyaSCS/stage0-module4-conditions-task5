package school.mjc.stage0.conditions.task5;

import java.util.Scanner;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("27 or 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("wrong number!");
        }

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month number ");
        int monthNumber=input.nextInt();

        SwitchDaysInMonthPrinter switchDaysInMonthPrinter=new SwitchDaysInMonthPrinter();
        switchDaysInMonthPrinter.amountOfDays(monthNumber);
    }
}
