package emc_java_tutorial.src;
interface Hi{
    void display();
}
public class lambda_expression {
    public static void main(String[] args){
        // Before seeing this see the function_interface code.
        //This is called lambda function.
        Hello a1 = () -> {System.out.println("Hello everyone");};
        a1.display();
    }
}

