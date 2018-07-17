package Lesson2_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        String stroka = "021z21Af";
        Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher m = p.matcher(stroka);
        System.out.println(m.matches());
    }
}
