package Lesson2_1.Marathon;

import java.util.Vector;

class Course {
    private int count = 0;
    private int capacity = 5;
    private int size = 0;
    private Vector<Obstacle> courses = new Vector<>(capacity);
    /*private Obstacle[] courses = new Obstacle[100];*/
    Course(Obstacle ... arg){
        for (Obstacle a: arg) {
            courses.add(a);
            count++;
            size++;
            if (sizeCheck()){
                capacity *= 2;
                Vector<Obstacle> temporary = new Vector<>(capacity);
                for (int i = 0 ;i < size; i++) {
                    temporary.add(courses.elementAt(i));
                }
                courses.setSize(capacity);
                courses = temporary;
            }
        }
    }
    boolean sizeCheck(){
        return size > capacity;
    }
    void doIt(Team team)
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < count; j++) {
                courses.elementAt(j).doIt(team.getter(i));
            }
        }
    }
}
