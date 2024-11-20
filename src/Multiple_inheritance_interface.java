package emc_java_tutorial.src;
interface Printable{
    default void displays(){
        System.out.println("This is for printing");
    }
}
interface Showable{
    default void displays(){
        System.out.println("This is for showing");
    }
}
class Document implements Printable,Showable{
    public void displays(){
        System.out.println("The document is now visible");
    }
}
public class Multiple_inheritance_interface {
    public static void main(String[] args){
        Document d = new Document();
        d.displays();
    }
}
