package emc_java_tutorial.src;
class Zoo{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dogs extends Zoo{
    String breed;
    // already makeSound method is in super class. we can overriding it in the derived class.
    void makeSound(){
        System.out.println("Dog barks");
    }
    void fetch(){
        System.out.println("Dog is fetching");
    }
}
class Cat extends Zoo{
    String color;

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
    void climb(){System.out.println("Cat climbs");}
}

public class Code_challenge_inheritance {
    public static void main(String[] args){
        Dogs a1 = new Dogs();
        a1.name = "Timmy";
        a1.age = 5;
        a1.breed = "Golden";
        a1.name = "Shadow"; //See it is overrides the older one
        a1.age = 15; //So it can also be overrided
        System.out.println(a1.name);
        System.out.println(a1.age);
        System.out.println(a1.breed);
        a1.makeSound();
        a1.fetch();
        Cat c1 = new Cat();
        c1.name = "Tom";
        c1.age = 5;
        c1.color = "white";
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.color);
        c1.makeSound();
        c1.climb();
    }
}
