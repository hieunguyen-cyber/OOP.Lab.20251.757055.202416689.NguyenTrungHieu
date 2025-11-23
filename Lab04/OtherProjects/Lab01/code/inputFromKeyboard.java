package code;
import java.util.Scanner;

public class inputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("How tall are you (m)? ");
        double height = scanner.nextDouble();

        System.out.println("Mrs/Ms. " + name + ", " + age + " years old. " +
                           "Your height is " + height + " m.");
        scanner.close();
    }
}
