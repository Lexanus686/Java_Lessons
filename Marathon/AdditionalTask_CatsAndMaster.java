package Lesson2_1.Marathon;

import java.util.Vector;

public class AdditionalTask_CatsAndMaster {
    public static void main(String[] args) {
        AddCat one = new AddCat("One");
        AddCat one1 = new AddCat("One1");
        AddCat one2 = new AddCat("One2");
        AddCat one3 = new AddCat("One3");
        AddCat one4 = new AddCat("One4");
        AddCat one5 = new AddCat("One5");
        AddCat one6 = new AddCat("One6");
        Master master = new Master();
        master.getNames(one);
        master.getNames(one1);
        master.getNames(one2);
        master.getNames(one3);
        master.getNames(one4);
        master.getNames(one5);
        master.getNames(one6);
        master.info();
    }
}

class Master{
    Vector<String> Names = new Vector<>(5);
    private int capacity = 5;
    private int size = 0;
    void getNames(AddCat addCat){
        Names.add(addCat.name);
        size++;
        if (sizeCheck())
        {
            capacity *= 2;
            Vector<String> temporary = new Vector<>(capacity);
            for (int i = 0 ;i < size; i++) {
                temporary.add(Names.elementAt(i));
            }
            Names.setSize(capacity);
            Names = temporary;
        }
    }
    private boolean sizeCheck(){
        return size > capacity;
    }
    void info(){
        for (int i = 0; i < size; i++)
        {
            System.out.println(Names.elementAt(i));
        }
    }
}

class AddCat{
    String name;
    AddCat(String name){
        this.name = name;
    }
}
