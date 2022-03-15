package com.lab.lab8Q1;
import java.util.*;

public class CircleWithException {
    private double radius;
    private static double area;
    private double diameter;
    private double pi = 3.141;
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in); //create scanner object
        CircleWithException c = new CircleWithException();// create object for circlewithexception
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();// create variable for scan double


        try {
            if(radius > 0 )  { //radius can't be negative
                System.out.println(radius);
                c.setRadius(radius);

            }
            else{
                throw new IllegalArgumentException(); // activate exception method
            }


            System.out.println("The diameter is: " + c.getDiameter());

            if (c.getArea() > 1000) { // area can't exceed 1000, if not throw exception
                throw new Exception();
            }
            else{

                System.out.println("The area is: " + c.getArea());
            }


        } catch (IllegalArgumentException e) {
            System.out.println("No negative number");
        } catch (Exception e) {
            System.out.println("Area too big");
        }


    }

    public CircleWithException()  {
    }

    public CircleWithException(double radius, double area, double diameter){
        this.radius = radius;
        this.area = area;
        this.diameter = diameter;
    }


    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){return radius;}

    public double getArea() {
        area = pi * radius * radius;
        return area;
    }

    public double getDiameter(){
        diameter = 2 * radius;
        return diameter;
    }


}
