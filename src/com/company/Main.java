package com.company;


public class Main {

    public static void main(String[] args) {
        figure farr[] = {new figure() {
        @Override
        public double getArea(double a, double b, double c) {
            return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
        }

        @Override
        public double getPerimeter(double a, double b, double c) {
            return a+b+c;
        }
    },
    new figure() {
        @Override
        public double getArea(double a, double b, double c) {
            return a*b;
        }

        @Override
        public double getPerimeter(double a, double b, double c) {
            return a+b+c;
        }
    }};
        for (farr:
             ) {
            
        }

        System.out.println(rect.getArea(1,2,3));
        
    }
}