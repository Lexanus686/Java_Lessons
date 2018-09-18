import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <T> ArrayList<T> changeToArrayList(final T[] array) {
        ArrayList<T> vec = new ArrayList<>(Arrays.asList(array));
        return vec;
    }

    static <T> void info(T[] array) {
        for (T item: array
                ) {
            System.out.println(item);
        }
    }
}
