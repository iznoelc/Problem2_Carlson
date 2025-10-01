public class DeliveryDroneFactory implements DroneFactory {
    /**
     * Instantiates a new delivery drone
     * @return Drone, the drone instance
     */
    @Override
    public Drone createDrone() {
        return new DeliveryDrone();
    }
}
