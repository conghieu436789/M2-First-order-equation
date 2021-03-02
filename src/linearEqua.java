import java.util.Scanner;

public class linearEqua {
    public static void main(String[] args) {
        double x, a, b;
        Scanner Scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter number a: ");
//            a = Scanner.nextDouble();
//        } while (a == 0);
        System.out.println("Enter number a: ");
        a = Scanner.nextDouble();
        System.out.println("Enter number b: ");
        b = Scanner.nextDouble();
        if (a!=0) {
            x = (-b)/a;
            System.out.printf("The result is: %f",x);
        } else {
            if (b==0){
                System.out.println("Equation pass with all of ");
            } else {
                System.out.println("No result");
            }
        }
    }
}
