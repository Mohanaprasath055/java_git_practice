package emc_java_tutorial.src;
class Teacher{
    int age = 25;
    Teacher(String name){System.out.println("Name of the teacher is "+name);}
    void call(){System.out.println("malar teacher called Abdul");}
}
class Student extends Teacher{
    Student(){
        super("Malar"); //For passing parameter in a constructor of parent class
        System.out.println("Name of the student is Abdul");
        System.out.println("Age of malar teacher:" + super.age); //Using super we can also access the variable
        super.call(); // as well as the function of parent class

    }
}
public class Super {
    public static void main(String[] args){
        Student s = new Student();
    }
}
