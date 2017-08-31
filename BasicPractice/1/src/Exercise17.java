import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 0;
        int remainer = 0;
        int sum[] = new int[20];

        System.out.println("Input binary1 : ");
        long binary1 = in.nextLong();
        System.out.println("Input binary2 : ");
        long binary2 = in.nextLong();

        while(binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)(binary1 % 10 + binary2 % 10 + remainer) % 2;
            remainer = (int)(binary1 % 10 + binary2 % 10 + remainer) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if(remainer != 0)
        {
            sum[i++] = remainer;
        }

        i--;

        System.out.println("the result is: ");

        while (i >= 0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println("");
    }
}
