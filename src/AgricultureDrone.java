public class AgricultureDrone implements Drone {
    float batteryCapacity;
    float flightRange;
    String specialFeature;

    /**
     * Sets the battery capacity of the drone.
     * @param batteryCapacity, the battery capacity in mAh
     */
    @Override
    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Sets the flight range of the drone.
     * @param flightRange, the flight range in km
     */
    @Override
    public void setFlightRange(float flightRange) {
        this.flightRange = flightRange;
    }

    /**
     * Sets the special feature of the drone
     * @param specialFeature, explanation of the drone's special feature
     */
    @Override
    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

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
