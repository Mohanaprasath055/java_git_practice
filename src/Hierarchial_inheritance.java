package emc_java_tutorial.src;
class X{
    int x = 5;
}
class Y extends X{
    int y = 10;
}

class Z extends X{
    int z = 15;
}

public class Hierarchial_inheritance {
      public static void main(String[] args){
          //In this two class is derived from one super class so it is called as hierarchial_inheritance
         Z obj2 = new Z();
         System.out.println(obj2.z);
         System.out.println(obj2.x);
         Y obj3 = new Y();
         System.out.println(obj3.y);
         System.out.println(obj3.x);
         // Combining any two or all three inheritance forms a hybrid inheritance.
      }
}
