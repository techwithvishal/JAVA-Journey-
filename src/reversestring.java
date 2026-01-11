import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = sc.nextLine();   // take full message input

        String reversed = "";

        // reverse logic
        for (int i = msg.length() - 1; i >= 0; i--) {
            reversed = reversed + msg.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);
    }
}
