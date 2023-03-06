interface Predator{
    String bark();
}

abstract class Animal{
    public String hello(){
        return "hello";
    }

}

class Dog extends Animal{

}

class Lion extends Animal implements Predator{
    public String bark(){
        return "Bark bark!!";
    }
}

public class exercise7 {
    //Q8 오류찾기 1
    //Q9 오류찾기 2
    public static void main(String[] args) {
//        Animal a = new Animal();    //1 ok
//        Animal b = new Dog();       //2 ok
//        Animal c = new Lion();      //3 ok
//        Dog d = new Animal();       //4 not ok
//        Predator e = new Lion();    //5 ok
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

        System.out.println(a.hello());  //1 ok
        //System.out.println(a.bark());   //2 not ok
        System.out.println(b.hello());  //3 ok
        System.out.println(b.bark());   //4 ok
        //System.out.println(c.hello());  //5 not ok
        System.out.println(c.bark());   //6 ok


    }
}
