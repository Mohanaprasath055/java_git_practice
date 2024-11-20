package emc_java_tutorial.src;
abstract class Animals{
    abstract void makeSoundAnimal();
}
class Doggy extends Animals{
    void makeSoundAnimal(){
        System.out.println("Dog bracks");
    }
}
class Cats extends Animals{
    void makeSoundAnimal(){
        System.out.println("Cat meows");
    }
}
public class code_challenge_abstract {
    public static void main(String[] args){
        Doggy d = new Doggy();
        Cats c = new Cats();
        d.makeSoundAnimal();
        c.makeSoundAnimal();
    }
}
