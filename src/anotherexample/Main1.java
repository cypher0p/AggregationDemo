package anotherexample;

public class Main1 {
    public static void main(String[] args) {
        Address address = new Address("Agra", "UttarPradesh", "India");
        Address address2 = new Address("Mathura", "UttarPradesh", "India");

        Employee employee1 = new Employee(111, "Varun", address);
        Employee employee2 = new Employee(121, "Vaidik", address2);

        employee1.display();
        employee2.display();
    }
}
