package Lesson2_1.Marathon;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
    void infoAboutBuffer();
}
