package Lesson2_2;

import java.util.Scanner;

public class MainHomework {
    private static String[][] array = new String[4][4];

    public static void main(String[] args) {
        System.out.println("Введите массив, размером 4х4: ");
        try {
            FillArray(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        int sum = 0;
        boolean res = true;
        try {
            sum = SummariseElementsOfArray(array);
        } catch (MyArrayDataException e){
            res = !res;
            e.printStackTrace();
        } finally {
            if ((res)) {
                System.out.println("Sum is " + sum);
            } else {
                System.out.println("Invalid result");
            }
        }

    }

    private static int SummariseElementsOfArray (String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
            {
                int multiply = 1, local = 0;
                for (int k = array[i][j].length() - 1; k >= 0; k--)
                {
                    if (array[i][j].charAt(k) > '9' | array[i][j].charAt(k) < '0')
                        throw new MyArrayDataException("Wrong data in " + "[" + i + "][" + j + "] bracket");
                    else local = multiply*local + Character.getNumericValue(array[i][j].charAt(k));
                }
                sum += local;
            }
        return sum;
    }

    private static int countMissles(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        return count;
    }

    private static void FillArray(String[][] array) throws MyArraySizeException {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            String stroka = sc.nextLine();
            int res = countMissles(stroka);
            if (res != 4) throw new MyArraySizeException("Exception of array size");
            int lastPosition = -1;
            int counter = 0;
            for (int j = 0; j < stroka.length(); j++)
            {
                if (stroka.charAt(j) == ' ')
                {
                    array[i][counter] = stroka.substring(lastPosition+1, j);
                    counter++;
                    lastPosition = j;
                }
            }
            array[i][counter++] = stroka.substring(lastPosition+1, stroka.length());
        }
    }

}

class MyArraySizeException extends Exception {
    MyArraySizeException(String msg) {
        super(msg);
    }
}

class MyArrayDataException extends Exception {
    MyArrayDataException(String msg) {
        super(msg);
    }
}
