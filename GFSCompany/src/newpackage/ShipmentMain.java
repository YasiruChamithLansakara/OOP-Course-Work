
package newpackage;

class Shipment
{
    private String shipmentID;
    private double weight;
    private String destination;
    public double totalCost;
    
    public Shipment(String shipmentID, double weight, String destination){
        this.shipmentID = shipmentID;
        this.weight = weight;
        this.destination = destination;
    }

    public String getShipmentID() {
        return shipmentID;
    }

    public void setShipmentID(String shipmentID) {
        this.shipmentID = shipmentID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public double calculateTotalCost()
    {
        return 0;
    }
    
    public void displayData()
    {
        //System.out.println("");
    }
    
}

class DomesticShipment extends Shipment
{
    private String region;
    private double shipmentCost;

    public DomesticShipment(String shipmentID, double weight, String destination, String region, double shipmentCost) {
        super(shipmentID, weight, destination);
        this.region = region;
        this.shipmentCost = shipmentCost;
    }
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }
    
    @Override
    public double calculateTotalCost()
    {
        double tax = 0;
        tax = shipmentCost * 0.05;
        totalCost = shipmentCost + tax;
        return totalCost;
    }
    
    public void displayData()
    {
        System.out.println("Total cost (Domestic): "+totalCost);
    }
}

class InternationalShipment extends Shipment
{
    private double customFee;
    private double insuranceFee;
    private double shipmentCost;

    public InternationalShipment(String shipmentID, double weight, String destination, double customFee, double insuranceFee, double shipmentCost) {
        super(shipmentID, weight, destination);
        this.customFee = customFee;
        this.insuranceFee = insuranceFee;
        this.shipmentCost = shipmentCost;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }
    
    @Override
    public double calculateTotalCost()
    {
        double tax = 0;
        tax = shipmentCost * 0.15;
        totalCost = shipmentCost + customFee + insuranceFee + tax;
        return totalCost;
    }
    
    public void displayData()
    {
        System.out.println("Total cost (International): "+totalCost);
    }
}

public class ShipmentMain {
    public static void main(String[] args) {
        
        DomesticShipment ds1 = new DomesticShipment("DS01", 100, "Sri lanka", "West", 5000);
        ds1.calculateTotalCost();
        ds1.displayData();
        
        InternationalShipment is1 = new InternationalShipment("IS01", 200, "India", 500, 1000, 5000);
        is1.calculateTotalCost();
        is1.displayData();
        
    }
    
}
