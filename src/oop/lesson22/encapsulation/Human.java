package oop.lesson22.encapsulation;

public class Human {
    final String sex;
    private String name;
    private int age;
    private int weight;

    Human(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}

class Test {
    public static void main(String[] args) {

        Human h = new Human("male");
        h.setName("Kolya");
        h.setWeight(50);
        h.setAge(15);
        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getWeight());

        h.setWeight(-40);
        System.out.println(h.getWeight());


    }
}
