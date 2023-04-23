public class ArrayWorking {
    int[] array = new int[10];
    int count = 0;

    public void insert(int value) {
        array[count] = value;
        count++;
    }

    public void display() {
        System.out.println("Массив:");
        String str = "";
        for (int i = 0; i < count; i++) {
            str += array[i] + " ";
        }
        System.out.println(str);
    }

    public void delete(int pos) {
        for (int i = pos; i < count; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public void sort() {
        int temp = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public int search(int value){
        for (int i = 0; i < count; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        System.out.println("Элемента нет");
        return -1;
    }
}
