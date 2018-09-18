import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends  Fruit> {
    ArrayList<T> Collector;

    public Box() {
        Collector = new ArrayList<T>();
    }

    public void add(T obj) {
        Collector.add(obj);
    }

    public float getWeight() {
        return Collector.size() * ((Collector.size() == 0) ? 0 : Collector.get(0).getFruitWeight());
    }

    public boolean compare(Box obj) {
        return this.getWeight() == obj.getWeight();
    }

    private T remover() {
        T tmp = Collector.get(0);
        Collector.remove(0);
        return tmp;
    }

    private void addAll(ArrayList<T> tmp) {
        Collector.addAll(tmp);
    }

    private int getSize() {
        return Collector.size();
    }

    public boolean intersperse(Box<T> obj) {
            ArrayList<T> tmp = new ArrayList<>();
            while (this.getSize() != 0) {
                tmp.add(this.remover());
            }
            obj.addAll(tmp);
            return true;
    }
}
