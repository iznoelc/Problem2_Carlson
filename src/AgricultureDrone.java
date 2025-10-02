public class AgricultureDrone extends Drone {
    /**
     * Prints the agriculture drone's specifications to the console.
     */
    @Override
    public void printDroneSpecifications() {
        System.out.println("AGRICULTURE DRONE SPECIFICATIONS:");
        System.out.println("Battery capacity: " + batteryCapacity + " mAh");
        System.out.println("Flight range: " + flightRange + " km");
        System.out.println("Special feature: " + specialFeature);
    }
}
