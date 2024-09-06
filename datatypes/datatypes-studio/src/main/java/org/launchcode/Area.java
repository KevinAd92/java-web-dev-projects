package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius?");
        Double radius = input.nextDouble();
       // if ( radius == ){
       // }
        while (radius <= 0) {
            System.out.println("Incorrect value with a radius of " + radius + " an area cannot be found.");
            System.out.println("Enter a radius");
            radius = input.nextDouble();
        }

        Double area = Circle.getArea(radius);
        System.out.print("The area of a circle with a radius of "+ radius +" is: " + area);

    }
}
