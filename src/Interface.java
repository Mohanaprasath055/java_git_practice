package emc_java_tutorial.src;
interface Playable{
    // By default all the funtion in an interface is abstract, variable declared will be final.
    // To give a body to a function either you should static or default keyword before the function.
    // While calling an interface don't forget to use public keyword before it.
    void play();
}

class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("This is a guitar");
    }
}
class Panio implements Playable{
    public void play(){
        System.out.println("This is a Panio");
    }
}

public class Interface {
    public static void main(String[] args){
        Panio p1 = new Panio();
        Guitar g1 = new Guitar();
        p1.play();
        g1.play();
    }
}
