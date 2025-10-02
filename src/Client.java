import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        DroneManufacturerFactory manufacturerFactory = new DroneManufacturerFactory(); // used to get correct drone manufacturer
        DroneManufacturer droneManufacturer; // will store chosen manufacturer
        Drone userDrone; // will store chosen drone with properties based on manufacturer specifications

        // variables to hold user's choices
        String manufacturerChoice;
        String droneChoice;

        // get the user's manufacturer choice
        System.out.println("SELECT A MANUFACTURER:");
        System.out.print("A >> for drones with longer flight range | B >> for drones with longer battery life: ");
        manufacturerChoice = scnr.nextLine();

        // use the manufacturer factory to instantiate the correct manufacturer
        droneManufacturer = manufacturerFactory.establishManufacturer(manufacturerChoice);

        // get the user's drone choice
        System.out.println("-----------------------------");
        System.out.println("Choose a type of drone: ");
        System.out.print("A >> Agriculture Drone | B >> Delivery Drone | C >> Surveillance Drone: ");
        droneChoice = scnr.nextLine();

        // use the helper function & manufacturer to instantiate the right kind of drone
        // and customize it according to manufacturer specifications
        userDrone = manufactureDrone(droneChoice, droneManufacturer);

        // print final drone details
        System.out.println("DRONE CHOSEN -- PRINTING DETAILS...");
        userDrone.printDroneSpecifications();
    }

    /**
     * Helper function for creating the right kind of drone based on user-input
     * @return Drone, Correct type of drone for correct manufacturer based on user input
     * @param droneChoice, the user's drone choice
     * @param manufacturer, the manufacturer used to get the right kind of drone based on user's input
     */
    public static Drone manufactureDrone(String droneChoice, DroneManufacturer manufacturer){
        if (droneChoice.equalsIgnoreCase("A")){
            return manufacturer.configureAgricultureDrone();
        } else if (droneChoice.equalsIgnoreCase("B")){
            return manufacturer.configureDeliveryDrone();
        } else if (droneChoice.equalsIgnoreCase("C")){
            return manufacturer.configureSurveillanceDrone();
        } else {
            throw new IllegalArgumentException("Unknown drone type");
        }
    }
}
