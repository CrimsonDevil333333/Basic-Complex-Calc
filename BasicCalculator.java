package com.company;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Value: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second Value: ");
        String str2 = scanner.nextLine();
        float f1 = Float.parseFloat(str1);
        float f2 = Float.parseFloat(str2);
        System.out.println(f1+f2);
    }
}
