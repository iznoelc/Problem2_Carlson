public class AgricultureDroneFactory implements DroneFactory {
    /**
     * Instantiates a new agriculture drone
     * @return Drone, the drone instance
     */
    @Override
    public Drone createDrone() {
        return new AgricultureDrone();
    }
}
