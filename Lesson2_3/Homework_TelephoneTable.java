package Lesson2_3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Homework_TelephoneTable {
    public static void main(String[] args) {
        TelephoneTable table = new TelephoneTable();
        table.add("5", "lel");
        table.add("4", "lelka");
        table.add("5", "lelolol");
        System.out.println("5: " + table.get("3"));
    }
}

class TelephoneTable{
    HashMap<String, LinkedList<String>> table;
    TelephoneTable()
    {
        table = new HashMap<>();
    }
    void add(String name, String phone){
        LinkedList<String> wow = table.get(name) == null ? new LinkedList<>() : table.get(name);
        wow.add(phone);
        table.put(name, wow);
    }

    String get(String name){
        String stroka = "( ";
        try {
            if (table.get(name) == null)
                throw new NoNumberException("No actual numbers. Add some or try to find another name");
            LinkedList<String> tmp = table.get(name);
            ListIterator<String> cur = tmp.listIterator();
            while (cur.hasNext())
            {
                stroka += cur.next() + " ";
            }
        } catch (NoNumberException e) {
            stroka += "... ";
            e.printStackTrace();
        } finally {
            stroka += ")";
        }
        return stroka;
    }
}

class NoNumberException extends NullPointerException {
    NoNumberException(String msg){
        super(msg);
    }
}