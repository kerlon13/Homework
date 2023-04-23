public class Main {
    public static void main(String[] args) {
        ArrayWorking arr = new ArrayWorking();
        arr.insert(10);
        arr.insert(123);
        arr.insert(89);
        arr.display();
        arr.sort();
        arr.display();
        System.out.println(arr.search(10));
        arr.delete(1);
        arr.display();
    }
}
