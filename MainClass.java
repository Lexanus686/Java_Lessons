import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        /*Integer[] arrayTest = {5, 2, 4, 3};
        Array.<Integer>swap(arrayTest, 0, 2);
        Array.<Integer>info(arrayTest);
        System.out.println("Before: " + arrayTest.getClass().getSimpleName());
        ArrayList<Integer> newArrayTest = Array.changeToArrayList(arrayTest);
        System.out.println("After: " + newArrayTest.getClass().getSimpleName());
        System.out.println(newArrayTest);
        System.out.println();
        newArrayTest.add(5);
        System.out.println(newArrayTest);*/
        Box<Orange> box = new Box<>();
        Box<Apple> box1 = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        box.add(orange1);
        box.add(orange2);
        box.add(orange3);
        box.add(orange4);
        System.out.println(box.getWeight());
        box1.add(apple1);
        box1.add(apple2);
        box1.add(apple3);
        box1.add(apple4);
        box1.add(apple5);
        box1.add(apple6);
        System.out.println(box1.getWeight());
        System.out.println(box.compare(box1));
        Box<Orange> box2 = new Box<>();
        box2.add(orange2);
        box2.add(orange4);
        System.out.println(box.intersperse(box2));
        System.out.println(box.getWeight());
        System.out.println(box2.getWeight());
    }

}
