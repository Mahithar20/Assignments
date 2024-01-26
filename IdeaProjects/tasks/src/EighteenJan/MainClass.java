package EighteenJan;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal cat = new Animal();

        cat.speak();
        Car verna = new Car();
        verna.maxSpeed = 100;
        verna.acceleration();
        Person human = new Person();
        human.activity();
        Employee tcsEmployee = new Employee();
        tcsEmployee.salary = 12000;
        tcsEmployee.salaryDetails();

    }

}

class Animal {
    String name;
    int age;
    float weight;
    void speak()
    {
        System.out.println("Animal Speaks");
    }
}
class Car{
    String name;
    int maxSpeed;
    float airInWheels;
    void acceleration(){

        System.out.println("Max Acceleration is "+ maxSpeed);
    }
}

class Person{
    String nameOfThePerson;
    int age;
    float height;
    char gender;
    void activity(){
        System.out.println("The person should have minimum activity");
    }
}

class Employee{
    String eName;
    int eNum;
    float salary;

    void salaryDetails(){
        System.out.println("The annual salary of the employee is "+ (12 * salary));
    }
}
