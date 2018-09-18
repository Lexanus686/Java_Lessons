abstract class Fruit {
    float weight;
    abstract float getFruitWeight();
}

class Apple extends Fruit {
    float weight = 1.0f;
    float getFruitWeight() {
        return this.weight;
    }
}

class Orange extends Fruit {
    float weight = 1.5f;
    float getFruitWeight() {
        return this.weight;
    }
}
