package emc_java_tutorial.src;

import java.util.Scanner;

class Person{
    public String name;
    protected int age;
    private String socialsecuritynumber;
    String address;
    Person(){
        System.out.println("Hello. This is Person (super) class without arguments");
    }
    Person(String name,int age,String ssn,String location){
        System.out.println("This is Person (super) class with arguments");
        this.name = name;
        this.age = age;
        socialsecuritynumber = ssn;
        address = location;
    }
     void display(){
        System.out.println(socialsecuritynumber);
    }

}
class Employee extends Person{
    Employee(String name,int age,String ssn,String location){
        super(name,age,ssn,location); //This super keyword calls the function person with parameter
        System.out.println("This is the Employee (derived) class");
    }
}
public class Access_modifiers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name:");
        String n = s.next();
        System.out.println("Enter your Age:");
        int a = s.nextInt();
        System.out.println("Enter your Social security Number:");
        String ssn = s.next();
        System.out.println("Enter your location:");
        String l = s.next();
        Employee e1 = new Employee(n,a,ssn,l);
        System.out.println(e1.name); //This can be accessed
        System.out.println(e1.age); //This can be accessed
//        System.out.println(e1.socialsecuritynumber); //Since it is private it cannot be access directly.
        e1.display();
        System.out.println(e1.address); //This can be accessed
    }
}
