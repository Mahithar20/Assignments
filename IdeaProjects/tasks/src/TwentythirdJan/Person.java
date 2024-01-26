package TwentythirdJan;

import javax.swing.*;

public class Person {
    String name;
    int age;
    double height;
    Person(){

    }
    public Person(String name, int age, double height) {
        System.out.println("name of person: "+ name);
        System.out.println("Age of the person: "+ age);
        System.out.println("height of the person: "+ height);
        this.name=name;
        }
    void walk(int speed){
        System.out.println(name +" walks at speed of "+ speed + " kmph");

    }
}
