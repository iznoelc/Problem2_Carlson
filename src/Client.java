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

        if (droneChoice.equalsIgnoreCase("A")){
            droneChoice = "agriculture";
        } else if (droneChoice.equals("B")){
            droneChoice = "delivery";
        } else if (droneChoice.equals("C")){
            droneChoice = "surveillance";
        }

        // customize chosen drone according to manufacturer specifications
        userDrone = droneManufacturer.manufactureDrone(droneChoice);

        // print final drone details
        System.out.println("DRONE CHOSEN -- PRINTING DETAILS...");
        userDrone.printDroneSpecifications();
    }
}
