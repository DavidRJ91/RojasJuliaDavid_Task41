import transport.Vehicle;

public class TestVehicle {
    static public void main(String args[]) {
        Vehicle myVehicle = new Vehicle(10000);
        System.out.println(myVehicle.getMaxLoad());
    }
}