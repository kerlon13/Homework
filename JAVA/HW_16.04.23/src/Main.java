import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
 //Цикл for многократно выполняет блок кода, условие цикла зависит от уменьшения или увеличения
 //целочисленной переменной. Цикл прерывается когда переменная достигает определенного целевого значения.
 //Цикл while зависит от логического условия и пока оно истинно,блок кода выполняется повторно.
 //Цикл do while сначала выполняет блок кода, а затем оценивает условие.
        System.out.println("Цикл for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Цикл while");
        int j=1;
        while (j<=10){
            System.out.println(j);
            j++;
        }

        System.out.println("Цикл do while");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k<=10);

        System.out.println(isEquals(12,12));
        input();

        Cat cat=new Cat(10,14,"Murzik");
        cat.out();
        cat.setAge(8);
        cat.setWeight(10);
        cat.setName("Tom");
        cat.out();

    }

    public static boolean isEquals(int num1, int num2) {
        return num1==num2;
    }

    public static void input() {
        System.out.println("Введите число");
        int number = scan.nextInt();
    }

}

