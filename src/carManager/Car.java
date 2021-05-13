package carManager;

public class Car {
    String brand;
    int yearOfProduction;
    int price;
    int weight;
//    String color;
    Color color;

//    конструктор
    public Car(String brand, int yearOfProduction, int price, int weight, Color color) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
