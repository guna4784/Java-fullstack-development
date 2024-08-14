import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int a, b, c = 0, n = 0;

        a = number;

        for (;a != 0; a/= 10, ++n);

       a = number;

        for (;a != 0; a /= 10) {
            b = a % 10;
            c += Math.pow(b, n);
        }

        if(c == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
