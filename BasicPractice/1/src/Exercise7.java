import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("input num: ");
        int num = in.nextInt();
        int i = 0;

        for(i = 0; i < 10; i++)
        {
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }
    }
}

