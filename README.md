# PROBLEM2_CARLSON
Drone Management System HW1 Problem

## RESOURCES
I did not use any outside resources for this problem other than the 
- Factory/Abstract Factory slides
- Week5/IkeaFurniture and Week5/FactoryAbstract practice problems (as reference)

## EXPLANATION OF DESIGN CHOICES
- *Factory* method was used to handle the manufacturers for flexibility and extensibility. Using the factory method, the creation of a manufacturer object does not require modification of the client code. Thus, the code can easily be extended to implement new manufacturers. Since each drone will have different specifications per manufacturer, the drones specifications can be set in the concrete Manufacturer classes, while the Manufacturer Factory determines which manufacturer to use. 
- *Abstract factory* method was used to handle the drones, allowing for new types of drones to be added easily. The drones have the outline for specification, but the specific values will need to be determined per manufacturer.

## ANSWERS TO EXTENSIBILITY QUESTIONS
**If you wanted to add RescueDrone...**
- Create new "RescueDrone" and "RescueDroneFactory" classes.
  - In "RescueDrone," implement the "Drone" interface
  - In "RescueDroneFactor," implement the "DroneFactory" interface.
- In the "DroneManufacturer" interface, create the signature for a "configureRescueDrone" method.
- In each Manufacturer class (i.e. "ManufacturerA" and "ManufacturerB," implement "configureRescueDrone" method, setting value specifications depending on the manufacturer.

  **If you wanted to add ManufacturerC...**
  - Create a new "ManufacturerC" class.
    - Implement the "DroneManufacturer" interface in the "ManufacturerC" class.
  - Update "DroneManufacturerFactory" class
    - Update the if/else statement to include (before the final else)
      - if (manufacturer.equalsIgnoreCase("C")){ return new ManufacturerC(); } 
