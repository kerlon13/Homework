public class Main {

    public static void main(String[] args) {
    //1
    Car car1 = new Car("Mazda",2012,8000);
    Car car2 = new Car("BMW", 2022, 45000, true);
    car1.out();
    car2.outElectric();
    //2
    System.out.println(plus(2,3));
    System.out.println(minus(10,2));
    System.out.println(multi(3,5));
    System.out.println(div(15,3));
    //3
    System.out.println(isMore(12,11,5));
    System.out.println(isMoreOnly(10,9,8));
    System.out.println(isMoreJustOne(10,3,2));
    }

    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    public static int multi(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        return a/b;
    }

    public static boolean isMore(int a, int b,int c) {
        return a>b && a>c;
    }

    public static boolean isMoreOnly(int a, int b, int c) {
        return a>b || a>c;
    }

    public static boolean isMoreJustOne(int a,int b, int c){
        return a>b ^ a>c;
    }
}
