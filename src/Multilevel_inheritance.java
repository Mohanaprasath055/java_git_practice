package emc_java_tutorial.src;
//This is an example of multi-level inheritance
class A{
    int a = 5;
}
class B extends A{
    int b = 10;
}

class C extends B{
    int c = 15;
}

public class Multilevel_inheritance {
    public static void main(String[] args){
        C obj1 = new C();
        //Here the object of c can access both the variable/function of A,B this is called
        //Multi-level inheritance
        System.out.println(obj1.c);
        System.out.println(obj1.b);
        System.out.println(obj1.a);
    }
}
