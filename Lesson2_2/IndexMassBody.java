package Lesson2_2;

import java.util.Scanner;

public class IndexMassBody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            String line = sc.nextLine();
            int weight = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            float height = Float.parseFloat(line.substring(line.indexOf(' ')+1, line.length()));
            IMB(weight/(height*height));
        }
    }
    private static void IMB(float res){
        if (res < 18.5) System.out.println("under");
        else if (res >= 18.5 & res < 25.0) System.out.println("normal");
        else if (res >= 25.0 & res < 35.0) System.out.println("over");
        else System.out.println("obese");
    }
}
