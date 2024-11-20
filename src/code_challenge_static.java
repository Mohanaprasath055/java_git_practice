package emc_java_tutorial.src;
class Counter{
    static int count;
    int instanceNumber;
    Counter(){
        count++;
        instanceNumber++;
    }
    void disp(){
        System.out.println("instanceNumber:"+instanceNumber);
        System.out.println("count:"+count);
    }
}
public class code_challenge_static {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.disp();
        Counter c2 = new Counter();
        c2.disp();
        Counter c3 = new Counter();
        c3.disp();
    }
}
