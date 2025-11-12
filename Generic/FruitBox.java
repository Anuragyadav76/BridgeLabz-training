class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}
class FruitBox<T extends Fruit> {
    void addFruit(T fruit) { System.out.println(fruit.getClass().getSimpleName() + " added"); }
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());
    }
}