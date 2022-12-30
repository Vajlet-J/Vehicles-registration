import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        while (true) {
            System.out.println("Available options: 'car', 'motorcycle', 'truck'. Enter vehicle type: ");
            String vehicleType = scan.next();

            if (vehicleType.equalsIgnoreCase("car")) {
                System.out.println("Enter car model: ");
                String vehicleModel = scan.next();

                System.out.println("Enter engine size: ");
                int engineSize = scan.nextInt();

                System.out.println("Enter horse powers: ");
                int horsePowers = scan.nextInt();

                String engineType = "";

                boolean condition = true;
                while(condition) {
                    System.out.println("Enter engine type: ");
                    engineType = scan.next();
                    switch (engineType) {
                        case "electric":
                            condition = false;
                            break;
                        case "diesel":
                            condition = false;
                            break;
                        case "gasoline":
                            condition = false;
                            break;
                        default:
                            System.out.println("Wrong entry for engine type. Available options: 'electric', 'diesel' and 'gasoline'. Please try again.");
                    }
                }

                System.out.println("Enter number of doors: ");
                int doorsNumbers = scan.nextInt();

                System.out.println("Enter production year of the car: ");
                int productionYear = scan.nextInt();

                Vehicle v1 = new Car(vehicleModel, engineSize, horsePowers, engineType, doorsNumbers, productionYear);
                listOfVehicles.add(v1);

            } else if (vehicleType.equalsIgnoreCase("motorcycle")) {
                System.out.println("Enter motorcycle model: ");
                String vehicleModel = scan.next();

                System.out.println("Enter engine size: ");
                int engineSize = scan.nextInt();

                System.out.println("Enter horse powers: ");
                int horsePowers = scan.nextInt();

                String engineType = "";

                boolean condition = true;
                while(condition) {
                    System.out.println("Enter engine type: ");
                    engineType = scan.next();
                    switch (engineType) {
                        case "electric":
                            condition = false;
                            break;
                        case "diesel":
                            condition = false;
                            break;
                        case "gasoline":
                            condition = false;
                            break;
                        default:
                            System.out.println("Wrong entry for engine type. Available options: 'electric', 'diesel' and 'gasoline'. Please try again.");
                    }
                }

                System.out.println("Enter production year of the motorcycle: ");
                int productionYear = scan.nextInt();

                Vehicle v2 = new Motorcycle(vehicleModel, engineSize, horsePowers, engineType, productionYear);
                listOfVehicles.add(v2);

            } else if (vehicleType.equalsIgnoreCase("truck")) {
                System.out.println("Enter truck model: ");
                String vehicleModel = scan.next();

                System.out.println("Enter engine size: ");
                int engineSize = scan.nextInt();

                System.out.println("Enter horse powers: ");
                int horsePowers = scan.nextInt();

                String engineType = "";

                boolean condition = true;
                while(condition) {
                    System.out.println("Enter engine type: ");
                    engineType = scan.next();
                    switch (engineType) {
                        case "electric":
                            condition = false;
                            break;
                        case "diesel":
                            condition = false;
                            break;
                        case "gasoline":
                            condition = false;
                            break;
                        default:
                            System.out.println("Wrong entry for engine type. Available options: 'electric', 'diesel' and 'gasoline'. Please try again.");
                    }
                }

                System.out.println("Enter number of trailers: ");
                int trailers = scan.nextInt();

                Vehicle v3 = new Truck(vehicleModel, engineSize, horsePowers, engineType, trailers);
                listOfVehicles.add(v3);
            } else {
                System.out.println("Wrong vehicle input. ");
            }

            System.out.println("If you want to proceed to the bill or to exit the program enter 'exit', if you want to continue to enter a new vehicle enter 'continue': ");
            String exit = scan.next();

            if (exit.equalsIgnoreCase("exit")) {
                System.out.println("You have finished entering the data.");
                break;
            }
            else if (exit.equalsIgnoreCase("continue")){}
            else {
                System.out.println("You have entered the wrong command.");
                break;
            }
        }

        double sum = 0;
        for (int i = 0; i < listOfVehicles.size(); i++){
            System.out.println("Vehicle " + (i + 1));
            System.out.println("---------------------------------------------------------------------");
            System.out.println(listOfVehicles.get(i).toString());
            System.out.println("Amount for registration: " + listOfVehicles.get(i).registrationPrice());
            System.out.println("---------------------------------------------------------------------");
            sum = sum + listOfVehicles.get(i).registrationPrice();
        }
        System.out.println("Amount for registration for " + listOfVehicles.size() + " vehicle/vehicles is: " + sum);

    }
}
