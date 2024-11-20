package emc_java_tutorial.src;
//In single inheritance, a derived (or child) class inherits from exactly one superclass (or parent class).


// This is super class or base class
class Animal{
    void eat(){
        System.out.println("Eat");
    }
}
//Since it is inherited from super class it is dervied class
// Here
class Dog extends Animal{
    void barks(){
        System.out.println("Barks");
    }
}
public class Single_inheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.barks();
        d1.eat();
    }
}
