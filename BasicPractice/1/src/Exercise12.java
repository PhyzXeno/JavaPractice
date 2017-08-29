import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("input num1: ");
        int num1 = in.nextInt();

        System.out.print("input num2: ");
        int num2 = in.nextInt();

        System.out.print("input num3: ");
        int num3 = in.nextInt();

        System.out.println("output average: " + (num1 + num2 + num3)/3.0);
    }
}
