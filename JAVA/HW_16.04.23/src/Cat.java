public class Cat {
    int age;
    double weight;
    String name;

    public Cat(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void out() {
        System.out.println("Возраст кота:"+getAge()+"\n" +
                "Вес кота:"+getWeight()+"\n"+
                "Кличка кота:"+getName());
    }
}
