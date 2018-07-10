package Lesson2_1.Marathon;

public class Human implements Competitor {

    String name;
    String messageBuffer = "";

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxSwimDistance = 30;
        this.maxJumpHeight = 200;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance){
            messageBuffer += name + " " + " успешно пробежал дистанцию длиной " + dist + "; " + '\n';
        } else {
            messageBuffer += name + " " + " провалился в попытке пробежать дистанцию длиной " + dist + "; " + '\n';
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance){
            messageBuffer += name + " " + " успешно проплыл дистанцию длиной " + dist + "; " + '\n';
        } else {
            messageBuffer += name + " " + " провалился в попытке проплыть дистанцию длиной " + dist + "; " + '\n';
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            messageBuffer += name + " " + " успешно прыгнул на высоту " + height + "; " + '\n';
        } else {
            messageBuffer += name + " " + " не сумел допрыгнуть до высоты " + height + "; " + '\n';
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " - " + active + '\n');
    }

    @Override
    public void infoAboutBuffer() {
        System.out.println(messageBuffer);
    }
}
