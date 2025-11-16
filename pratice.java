import java.util.Scanner;

// si = prt/100
public class practice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter p ");
        int p= sc.nextInt();
        System.out.println("enter r ");
        int r = sc.nextInt();
        System.out.println("enter t ");
        int t = sc.nextInt();
        int si = p*r*t ;
        System.out.println("si is ");
        System.out.println(si/100);

       
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        String st = sc.nextLine();
        System.out.println(st);
        int in = sc.nextInt();
        System.out.println(in);
        float in1 = sc.nextFloat();
        System.out.println(in1);
        boolean in2 = sc.nextBoolean();
        System.out.println(in2);
        byte in3 = sc.nextByte();
        System.out.println(in3);
        double in4 = sc.nextDouble();
        System.out.println(in4);
        short in5 = sc.nextShort();
        long in6 = sc.nextLong();
        System.out.println(in6);







    }
}
