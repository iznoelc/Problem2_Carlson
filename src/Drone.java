public interface Drone {
    /**
     * Sets the battery capacity of the drone.
     * @param batteryCapacity, the battery capacity in mAh
     */
    void setBatteryCapacity(float batteryCapacity);

    /**
     * Sets the flight range of the drone.
     * @param flightRange, the flight range in km
     */
    void setFlightRange(float flightRange);

    /**
     * Sets the special feature of the drone
     * @param specialFeature, explanation of the drone's special feature
     */
    void setSpecialFeature(String specialFeature);

    /**
     * Prints drone's specifications to the console.
     */
    void printDroneSpecifications();
}
