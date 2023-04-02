public class Car {
    private String brand;
    private int age;
    private double price;
    private boolean isElectric;

    public Car(String brand, int age, double price) {
        this.brand = brand;
        this.age = age;
        this.price = price;
    }

    public Car(String brand, int age, double price, boolean isElectric) {
        this.brand = brand;
        this.age = age;
        this.price = price;
        this.isElectric = isElectric;
    }

    public void outElectric() {
        System.out.println("Бренд: "+getBrand()+"\n"+"Год выпуска: "+getAge()
                           +"\n"+"Цена: "+getPrice()+"\n"+"Электро? "+isElectric()+"\n");
    }

    public void out() {
        System.out.println("Бренд: "+getBrand()+"\n"+"Год выпуска: "+getAge()
                +"\n"+"Цена: "+getPrice()+"\n");
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
