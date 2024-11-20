package emc_java_tutorial.src;
// RULE 1: abstract function must be declared inside abstract class.
// RULE 2: abstract class cannot have a body.
// USAGE: If a abstract class is declared on the parent class, all the child class should have the function
//        in order to override it. In this example see speed();
abstract class Vehicle{
    abstract void speed();
}
class Bike extends Vehicle{
    @Override
    void speed() {
        System.out.println("Speed limit of bike is 25km/hr");
    }
    void hi(){System.out.println("Hello");}
}
class car extends Vehicle{
    void speed() {
        System.out.println("Speed limit of car is 35km/hr");
    }
}
public class abstract_class {
    public static void main(String[] args){
        Bike b1 = new Bike();
        b1.speed();
        car c1 = new car();
        c1.speed();
    }
}
