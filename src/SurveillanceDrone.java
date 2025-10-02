public class SurveillanceDrone extends Drone {
    /**
     * Prints the surveillance drone's specifications to the console.
     */
    @Override
    public void printDroneSpecifications() {
        System.out.println("SURVEILLANCE DRONE SPECIFICATIONS:");
        System.out.println("Battery capacity: " + batteryCapacity + " mAh");
        System.out.println("Flight range: " + flightRange + " km");
        System.out.println("Special feature: " + specialFeature);
    }
}
