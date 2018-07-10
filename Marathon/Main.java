package Lesson2_1.Marathon;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("redWoks", new Human("Alex"), new Cat("Oskar"), new Dog("LUL"), new Human("Vitya"));
        Course course = new Course(new Cross(50), new Water(20), new Wall(11), new Cross(2000));
        course.doIt(team);
        team.showSuccessResults();
        System.out.println("-----------------------------");
        team.showAllResults();
    }
}
