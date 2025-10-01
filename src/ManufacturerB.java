public class ManufacturerB implements DroneManufacturer {
    /**
     * Interacts with the drone abstract factory to create and configure an agriculture drone
     * for manufacturer B.
     * @return Drone, Configured agriculture drone for Manufacturer B
     */
    public Drone configureAgricultureDrone(){
        DroneFactory agricultureDroneFactory = new AgricultureDroneFactory();
        Drone agricultureDrone = agricultureDroneFactory.createDrone();

        agricultureDrone.setBatteryCapacity(22000.0f);
        agricultureDrone.setFlightRange(10.0f);
        agricultureDrone.setSpecialFeature("Route Optimization AI");

        return agricultureDrone;
    }

    /**
     * Interacts with the drone abstract factory to create and configure a delivery drone
     * for manufacturer B.
     * @return Drone, Configured delivery drone for Manufacturer B
     */
    public Drone configureDeliveryDrone(){
        DroneFactory deliveryDroneFactory = new DeliveryDroneFactory();
        Drone deliveryDrone = deliveryDroneFactory.createDrone();

        deliveryDrone.setBatteryCapacity(20000.0f);
        deliveryDrone.setFlightRange(55.0f);
        deliveryDrone.setSpecialFeature("Load-Based Power Management");

        return deliveryDrone;
    }

    /**
     * Interacts with the drone abstract factory to create and configure a surveillance drone
     * for manufacturer B.
     * @return Drone, Configured surveillance drone for Manufacturer B
     */
    public Drone configureSurveillanceDrone(){
        DroneFactory surveillanceDroneFactory = new SurveillanceDroneFactory();
        Drone surveillanceDrone = surveillanceDroneFactory.createDrone();

        surveillanceDrone.setBatteryCapacity(55000.0f);
        surveillanceDrone.setFlightRange(400.0f);
        surveillanceDrone.setSpecialFeature("Real-Time Video Streaming");

        return surveillanceDrone;
    }
}
