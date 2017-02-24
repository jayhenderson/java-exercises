package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        float userRadius = 0;
        while (userRadius <= 0)
        {
            System.out.print("Enter a radius: ");
            Scanner scan = new Scanner(System.in);
            userRadius = scan.nextFloat();
        }
        double area = 3.14 * userRadius * userRadius;
        System.out.println(String.format("The area of a circle of radius %.2f is: %.2f", userRadius, area));

    }
}
