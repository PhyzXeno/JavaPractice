public class Exercise15 {
    public static void main(String[] args){
        int a = 12;
        int b = 27;
        System.out.println("Before swapping:" + "a = " + a + "\tb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:" + "a = " + a + "\tb = " + b);
    }
}
