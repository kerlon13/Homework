public class Main {
    public static void main(String[] args) {

        byte b = 20;
        int i = 3200;
        //1
        i = b;
        System.out.println(i);
        //2
        int k = 30;
        b = (byte)k;
        System.out.println(b);
        //3
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.substring(1,4));
        System.out.println(str2.charAt(2));

        //reverse

        String reverse = "";
        for(int j=str1.length()-1;j>=0;j--) {
            reverse = reverse + str1.charAt(j);
        }
        System.out.println(reverse);
    }
}
