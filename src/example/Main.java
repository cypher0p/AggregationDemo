package example;

import example.Circle;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        double result = myCircle.area(5);
        System.out.println(result);
    }
}
