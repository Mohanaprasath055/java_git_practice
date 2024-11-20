package emc_java_tutorial.src;

public class static_keyword {
    static{
        System.out.println("Hey there");
    }
    public static void main(String[] args){
            System.out.println("Hello");
            //Static block will be executed whenever this class is executed.
            // Not matter how many objects you created but the static block will executed only once.
            static_keyword s1 = new static_keyword();
            static_keyword s2 = new static_keyword();
    }
}
