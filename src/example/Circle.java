package example;

public class Circle {
        Operation myOperation;
        double pi = 3.14;

        double area(int radius) {
            myOperation = new Operation();
            int rSquare = myOperation.square(radius);
            return pi*rSquare;
        }

}
