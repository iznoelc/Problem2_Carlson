public interface DroneManufacturer {
    /**
     * Configures an agriculture drone according to manufacturer specifications
     * @return Drone, the configured agriculture drone
     */
    Drone configureAgricultureDrone();

    /**
     * Configures a delivery drone according to manufacturer specifications
     * @return Drone, the configured delivery drone
     */
    Drone configureDeliveryDrone();

    /**
     * Configures a surveillance drone according to manufacturer specifications
     * @return Drone, the configured surveillance drone
     */
    Drone configureSurveillanceDrone();
}
