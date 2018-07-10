package Lesson2_1.Marathon;

public class Cat extends Animal {
    public Cat(String name){
        super("Кот", name, 200, 20, 0);
    }
}

class Dog extends Animal{

    public Dog(String name){
        super("Пес", name, 5, 5, 10);
    }
}
