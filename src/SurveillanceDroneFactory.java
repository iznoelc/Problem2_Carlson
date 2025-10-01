public class SurveillanceDroneFactory implements DroneFactory {
    /**
     * Instantiates a new surveillance drone
     * @return Drone, the drone instance
     */
    @Override
    public Drone createDrone() {
        return new SurveillanceDrone();
    }
}
