package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius?");
        Double radius = input.nextDouble();

        Double area = Circle.getArea(radius);
        System.out.print("The area of a circle with a radius of "+ radius +" is: " + area);

    }
}
