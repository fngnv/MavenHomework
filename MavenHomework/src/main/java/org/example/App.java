package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Distance: " + getDistance(9, 3));
    }

    public static double getDistance(double a, double b) {
        return b - a;
    }
}
