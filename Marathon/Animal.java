package Lesson2_1.Marathon;

public class Animal implements Competitor{

    String type;
    String name;
    String messageBuffer = "";

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance){
            messageBuffer += type + " " + name + " " + " успешно пробежал дистанцию длиной " + dist + "; " + '\n';
        } else {
            messageBuffer += type + " " + name + " " + " провалился в попытке пробежать дистанцию длиной " + dist + "; " + '\n';
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance){
            messageBuffer += type + " " + name + " " + " успешно проплыл дистанцию длиной " + dist + "; " + '\n';
        } else {
            messageBuffer += type + " " + name + " " + " провалился в попытке проплыть дистанцию длиной " + dist + "; " + '\n';
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            messageBuffer += type + " " + name + " " + " успешно прыгнул на высоту " + height + "; " + '\n';
        } else {
            messageBuffer += type + " " + name + " " + " не сумел допрыгнуть до высоты " + height + "; " + '\n';
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " - " + onDistance + '\n');
    }

    @Override
    public void infoAboutBuffer() {
        System.out.println(messageBuffer);
    }
}
