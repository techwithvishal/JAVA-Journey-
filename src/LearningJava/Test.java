//package LearningJava;
//
//public class Test {
//    static void main() {
//        System.out.printf("Kya Hal h");
//    }
//}
;
//
//    Practice polymorphism program
//    Method overloading (compile time polymorphism)

public class Test{
    int add(int a, int b) {
        return (a + b);

    }
    int add(int a , int b, int c ){
        return (a + b + c );
    }


    public  static void main(String[] args){
        Test t =  new Test();
        System.out.println(t.add(4,5,6));
        System.out.println(t.add(2, 4));
    }
}