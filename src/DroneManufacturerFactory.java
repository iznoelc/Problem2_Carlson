public class DroneManufacturerFactory {
    /**
     * Returns an instance of the correct manufacturer based on input, throwing an error if the input
     * is an invalid manufacturer type.
     * @param manufacturer, the desired manufacturer as a string
     * @return DroneManufacturer, the instantiated manufacturer
     */
    public DroneManufacturer establishManufacturer(String manufacturer){
        if (manufacturer.equalsIgnoreCase("A")) {
            return new ManufacturerA();
        } else if (manufacturer.equalsIgnoreCase("B")){
            return new ManufacturerB();
        } else {
            throw new IllegalArgumentException("Unknown manufacturer type");
        }
    }
}
