public class DeliveryDrone extends Drone {
    /**
     * Prints the delivery drone's specifications to the console.
     */
    @Override
    public void printDroneSpecifications() {
        System.out.println("DELIVERY DRONE SPECIFICATIONS:");
        System.out.println("Battery capacity: " + batteryCapacity + " mAh");
        System.out.println("Flight range: " + flightRange + " km");
        System.out.println("Special feature: " + specialFeature);
    }
}
