package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Integer length = input.nextInt();


        System.out.println("What is the width of the rectangle?");
        Integer width = input.nextInt();

        Integer area = length + width;
        System.out.println("Your rectangle has an area of " + area);


    };
}
