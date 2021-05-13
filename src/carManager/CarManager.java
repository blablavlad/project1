package carManager;

public class CarManager {
    public static void main (String[] args){

        Car prius = new Car("Toyota Prius", 2008,15000,1200,Color.GREEN);

        Car renault = new Car("Renault Laguna",2000,9700, 1600, Color.WHITE);

        Car lada = new Car("Lada Granta", 2005, 10000,980,Color.BLUE);

        System.out.println(prius);
        System.out.println(renault);
        System.out.println(lada);
    }
}
