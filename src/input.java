import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apna naam batao: ");
        String name = sc.nextLine();

        System.out.print("Apni age batao: ");
        int age = sc.nextInt();

        System.out.println("Namaste " + name + ", aapki age hai " + age);
    }
}


