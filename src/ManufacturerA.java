public class ManufacturerA implements DroneManufacturer {
    /**
     * Interacts with the drone abstract factory to create and configure an agriculture drone
     * for manufacturer A.
     * @return Drone, Configured agriculture drone for Manufacturer A
     */
    public Drone configureAgricultureDrone(){
        DroneFactory agricultureDroneFactory = new AgricultureDroneFactory();
        Drone agricultureDrone = agricultureDroneFactory.createDrone();

        agricultureDrone.setBatteryCapacity(18000.0f);
        agricultureDrone.setFlightRange(20.0f);
        agricultureDrone.setSpecialFeature("Pesticide Spraying");

        return agricultureDrone;
    }

    /**
     * Interacts with the drone abstract factory to create and configure a delivery drone
     * for manufacturer A.
     * @return Drone, Configured delivery drone for Manufacturer A
     */
    public Drone configureDeliveryDrone(){
        DroneFactory deliveryDroneFactory = new DeliveryDroneFactory();
        Drone deliveryDrone = deliveryDroneFactory.createDrone();

        deliveryDrone.setBatteryCapacity(18000.0f);
        deliveryDrone.setFlightRange(100.0f);
        deliveryDrone.setSpecialFeature("Carries multiple packages");

        return deliveryDrone;
    }

    /**
     * Interacts with the drone abstract factory to create and configure a surveillance drone
     * for manufacturer A.
     * @return Drone, Configured surveillance drone for Manufacturer A
     */
    public Drone configureSurveillanceDrone(){
        DroneFactory surveillanceDroneFactory = new SurveillanceDroneFactory();
        Drone surveillanceDrone = surveillanceDroneFactory.createDrone();

        surveillanceDrone.setBatteryCapacity(30000.0f);
        surveillanceDrone.setFlightRange(600.0f);
        surveillanceDrone.setSpecialFeature("Panoramic Camera");

        return surveillanceDrone;
    }
}
