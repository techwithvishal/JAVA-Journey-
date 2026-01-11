import java.sql.SQLOutput;

///////*
////////public class Display {
////////    void show(int a){
////////        System.out.println(a);
////////    }
////////
////////    void show(int a, int b){
////////        System.out.println(a+b);
////////    }
////////
////////    public static void main (String[] args){
////////        Display obj = new Display();
////////        obj.show(10);
////////        obj.show(10,20);
////////    }
////////}
//////
//////import java.util.Scanner;
//////
//////public class Main {
//////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////
//////        // Step 1: Take size of array
//////        System.out.print("Enter the number of elements: ");
//////        int n = sc.nextInt();
//////
//////        // Step 2: Declare array
//////        int[] arr = new int[n];
//////
//////        // Step 3: Take array input from user
//////        System.out.println("Enter " + n + " elements:");
//////        for (int i = 0; i < n; i++) {
//////            arr[i] = sc.nextInt();
//////        }
//////
//////        // Step 4: Calculate sum
//////        int sum = 0;
//////        for (int i = 0; i < n; i++) {
//////            sum += arr[i];
//////        }
//////
//////        // Step 5: Print result
//////        System.out.println("Sum of array elements = " + sum);
//////
//////        sc.close();
//////    }
//////}*/
//////
//////
////////   ------------------=Method k practice questions---
//////
//////// class Main{
////////
////////     static int sum(){
////////         int a =10;
////////         int b = 10;
////////         return a+b;
////////
////////     }
////////
////////     public static void  main(String[] args){
////////         int result = sum();
////////         System.out.println(result);
////////     }
////////}
//////
//////class Main{
//////   static void checknumber(int a){
//////        if (a%2==0){
//////            System.out.println("even no. h");
//////        }
//////        else{
//////            System.out.println("odd h");
//////        }
//////    }
//////
//////    public static void main(String[] args){
//////        checknumber(6);
//////    }
//////}
////
////
////
////class Main {
////
////    static double circleArea(double r) {
////        return 3.14 * r * r;
////    }
////
////    public static void main(String[] args) {
////        double area = circleArea(7);
////        System.out.println(area);
////    }
////}
//
//class Main{
//    static int Averagenumber(int a,int b, int c){
//        return  (a+b+c) / 3;
//    }
//
//    public static void main(String[] args){
//        int ans = Averagenumber(2,2,2);
//        System.out.println("Average of these no is:" + ans);
//    }
//}


//class Main {
//
//    static boolean isEligible(int age) {
//        if (age >= 18) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        boolean result = isEligible(20);
//        System.out.println(result);
//    }
//}

///
//
//class Student {
//
//    int roll = 51;   // data member
//
//    void show() {   // method
//        System.out.println(roll);
//    }
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student();  // object creation
////        s1.roll = 101;               // value assign
//        s1.show();                   // method call
//    }
//}


//// Stack class banayi jisme stack ka logic likha hai
//class Stack {
//
//    int top = -1;
//    // top stack ke top element ka index store karta hai
//    // -1 ka matlab stack abhi empty hai
//
//    int size = 5;
//    // stack ka maximum size define kiya (fixed size array stack)
//
//    int arr[] = new int[size];
//    // array banaya jisme stack ke elements store honge
//
//
//    // PUSH operation: stack me element add karne ke liye
//    void push(int x) {
//
//        // check kar rahe hain stack full hai ya nahi
//        if (top == size - 1) {
//            // agar top last index par hai to stack full hai
//            System.out.println("Stack Overflow");
//        }
//        else {
//            // pehle top ko next position par badhate hain
//            top++;
//
//            // naye top index par element store kar dete hain
//            arr[top] = x;
//
//            // confirmation message
//            System.out.println(x + " pushed into stack");
//        }
//    }
//
//
//    // POP operation: stack se element remove karne ke liye
//    void pop() {
//
//        // check kar rahe hain stack empty hai ya nahi
//        if (top == -1) {
//            // agar top -1 hai to stack empty hai
//            System.out.println("Stack Underflow");
//        }
//        else {
//            // jo element remove hone wala hai use print kar rahe hain
//            System.out.println(arr[top] + " popped from stack");
//
//            // top ko ek position neeche le ja rahe hain
//            top--;
//        }
//    }
//
//
//    // PEEK operation: sirf top element dekhne ke liye
//    void peek() {
//
//        // agar stack empty hai
//        if (top == -1) {
//            System.out.println("Stack is empty");
//        }
//        else {
//            // top element show kar rahe hain
//            System.out.println("Top element is: " + arr[top]);
//        }
//    }
//}
//
//
//// Main class jahan se program start hota hai
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Stack class ka object banaya
//        Stack s = new Stack();
//
//        // stack me elements push kar rahe hain
//        s.push(10);   // 10 add hoga
//        s.push(20);   // 20 add hoga
//        s.push(30);   // 30 add hoga
//
//        // top element dekh rahe hain
//        s.peek();     // output: 30
//
//        // top element remove kar rahe hain
//        s.pop();      // 30 remove hoga
//
//        // dobara top element check
//        s.peek();     // output: 20
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user se N terms input lena
        System.out.print("Enter number of terms (N): ");
        int n = sc.nextInt();

        // pehle do terms define karte hain
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        // loop chalate hain N terms tak
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");  // current term print

            // agla term calculate
            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
