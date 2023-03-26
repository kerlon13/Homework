import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char ch;
    static boolean bool;

    public static void main(String[] args) {

        System.out.println("Введите число типа byte");
        b = sc.nextByte();

        System.out.println("Введите число типа short");
        s = sc.nextShort();

        System.out.println("Введите число типа int");
        i = sc.nextInt();

        System.out.println("Введите число типа long");
        l = sc.nextLong();

        System.out.println("Введите число типа float");
        f = sc.nextFloat();

        System.out.println("Введите число типа double");
        d = sc.nextDouble();

        System.out.println("Введите символ");
        ch = sc.next().charAt(0);

        System.out.println("Введите true или false");
        bool = sc.nextBoolean();

        System.out.println("|------|-------|---------|--------|---------|----------|------|---------|");
        System.out.println("|-byte-|-short-|---int---|--long--|--float--|--double--|-char-|-boolean-|");
        System.out.println("|--"+b+"--|--"+s+"--|--"+i+"--|-"+l+"-|--"+f+"-|--"+d+"--|---"+ch+"--|--"+bool+"--|");
        System.out.println("|------|-------|---------|--------|---------|----------|------|---------|");

        System.out.println("");

        System.out.println("|------|-------|---------|--------|---------|----------|------|---------|");
        System.out.println("|-byte-|-short-|---int---|--long--|--float--|--double--|-char-|-boolean-|");
        System.out.printf("|%6d|%7d|%9d|%8d|%9.2f|%10.2f|%6c|%9b|\n", b,s,i,l,f,d,ch,bool);
        System.out.println("|------|-------|---------|--------|---------|----------|------|---------|");

    }
}
