package emc_java_tutorial.src;
interface Hello{
    void display();
}
public class function_interface {
    public static void main(String[] args){
        // We know that object cannot be created for an interface,But by doing like this
        // we can make it has function-interface.
        Hello a1 = new Hello(){
            public void display(){
                System.out.println("Hey There");
            }
        };
        a1.display();
    }
}
