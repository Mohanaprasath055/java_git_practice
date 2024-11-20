public class Teacher {
    String my_name;
    Teacher(){
        System.out.println("Hello");
    }
    void setName(String my_name){
        this.my_name = my_name;
    }
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.setName("Malar");
        System.out.println(t1.my_name); //IF we use like this it will be null value
        //The problem is in the setName() the line my_name = my_name The my_name is taken as our input my_name.
        //But in our function it should be taken as the global my_name
        //Here is where the this keyword comes into play
    }
}
