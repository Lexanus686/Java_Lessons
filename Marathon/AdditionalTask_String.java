package Lesson2_1.Marathon;

import java.util.Scanner;

public class AdditionalTask_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < count; i++) {
            String text = sc.next();
            for (int j = 0; j < text.length(); j++)
                if (text.charAt(j) == 'a' || text.charAt(j) == 'e' || text.charAt(j) == 'i' || text.charAt(j) == 'o' || text.charAt(j) == 'u' || text.charAt(j) == 'y') ans++;
            System.out.println(ans);
            ans = 0;
        }
    }
}
