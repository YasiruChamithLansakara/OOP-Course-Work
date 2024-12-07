package newpackage;

//Base class
abstract class Vehicle{
    protected double distance;
    protected double weight;
    
    //constructor
    public Vehicle(double distance, double weight){
        this.distance = distance;
        this.weight = weight;
    }
    
    // abstract method to calculate the cost for transport
    public abstract double calculateCost();
}

// subclass -----TRUCK-----
class Truck extends Vehicle{

    public Truck(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return distance *5+ weight*2;
    }
}

// subclass -----SHIP-----
class Ship extends Vehicle{

    public Ship(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return distance *3+ weight*1.5;
    }
}

// subclass -----AIRPLANE-----
class Airplane extends Vehicle{

    public Airplane(double distance, double weight) {
        super(distance, weight);
    }

    @Override
    public double calculateCost() {
        return distance *10+ weight*5;
    }
}

public class GlobalTrans {
    public static void main(String[] args){
//        Vehicle truck = new Truck(100,2000);
//        Vehicle ship = new Ship(100,2000);
//        Vehicle airplane = new Airplane(100,2000);

        //create objects with array - loop
        Vehicle[] vehicles = {
            new Truck(100,200),
            new Ship(500,10000),
            new Airplane(200,5000)
        };
        
        //display outputs with for loop
        System.out.println("Transport Costs: ");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() +": Rs. " +vehicle.calculateCost());
        }
        
//        System.out.println("Truck: Rs." +truck.calculateCost());
//        System.out.println("Ship: Rs." +ship.calculateCost());
//        System.out.println("Airplane: Rs." +airplane.calculateCost());
    }
}