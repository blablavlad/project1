package carManager;

public class Car {
    String brand;
    int yearOfProduction;
    int price;
    int weight;
    String color;

//    конструктор
    public Car(String brand, int yearOfProduction, int price, int weight, String color) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }
}
