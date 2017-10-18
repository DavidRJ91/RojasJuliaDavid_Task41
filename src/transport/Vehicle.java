package transport;

public class Vehicle {

    private double load;
    private double maxLoad;

    public Vehicle(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public boolean addBox(double weight) {
        if (weight <= maxLoad) {
            return true;
        } else {
            return false;
        }

    }
}




