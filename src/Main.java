import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
        String n;
        int engineSize = 0;
        int horsePowers = 0;
        boolean flag;

        while (true) {
            System.out.println("Choose vehicle type: " + "\n" + "Enter 1 for Car." + "\n" + "Enter 2 for Motorcycle." + "\n" + "Enter 3 for Truck.");
            String vehicleType = scan.next();

            if (vehicleType.equalsIgnoreCase("1")) {
                System.out.println("Enter car brend: ");
                String vehicleBrand = scan.next();

                System.out.println("Enter car model: ");
                String vehicleModel = scan.next();

                do{
                    System.out.println("Enter engine size: ");
                    n = scan.next();
                    try{
                    engineSize = Integer.parseInt(n);
                    flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                do{
                    System.out.println("Enter horse powers: ");
                    n = scan.next();
                    try{
                        horsePowers = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

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

                int doorsNumbers = 0;
                do{
                    System.out.println("Enter number of doors: ");
                    n = scan.next();
                    try{
                       doorsNumbers = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                int productionYear = 0;
                do{
                    System.out.println("Enter production year of the car: ");
                    n = scan.next();
                    try{
                        productionYear = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                Vehicle v1 = new Car(vehicleBrand, vehicleModel, engineSize, horsePowers, engineType, doorsNumbers, productionYear);
                listOfVehicles.add(v1);

            } else if (vehicleType.equalsIgnoreCase("2")) {
                System.out.println("Enter car brend: ");
                String vehicleBrand = scan.next();

                System.out.println("Enter motorcycle model: ");
                String vehicleModel = scan.next();

                do{
                    System.out.println("Enter engine size: ");
                    n = scan.next();
                    try{
                        engineSize = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                do{
                    System.out.println("Enter horse powers: ");
                    n = scan.next();
                    try{
                        horsePowers = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

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

                int productionYear = 0;
                do{
                    System.out.println("Enter production year of the motorcycle: ");
                    n = scan.next();
                    try{
                        productionYear = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                Vehicle v2 = new Motorcycle(vehicleBrand, vehicleModel, engineSize, horsePowers, engineType, productionYear);
                listOfVehicles.add(v2);

            } else if (vehicleType.equalsIgnoreCase("3")) {
                System.out.println("Enter car brend: ");
                String vehicleBrand = scan.next();

                System.out.println("Enter truck model: ");
                String vehicleModel = scan.next();

                do{
                    System.out.println("Enter engine size: ");
                    n = scan.next();
                    try{
                        engineSize = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                do{
                    System.out.println("Enter horse powers: ");
                    n = scan.next();
                    try{
                        horsePowers = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

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

                int trailers = 0;
                do{
                    System.out.println("Enter number of trailers: ");
                    n = scan.next();
                    try{
                        trailers = Integer.parseInt(n);
                        flag = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Enter only integer value. " );
                        flag = true;
                    }
                }while(flag);

                Vehicle v3 = new Truck(vehicleBrand, vehicleModel, engineSize, horsePowers, engineType, trailers);
                listOfVehicles.add(v3);
            } else {
                System.out.println("Wrong vehicle input. ");
            }

            System.out.println("If you want to proceed to the bill or to exit the program input 1, if you want to continue to enter a new vehicle input 2: ");
            String exit = scan.next();

            if (exit.equalsIgnoreCase("1")) {
                System.out.println("You have finished entering the data.");
                break;
            }
            else if (exit.equalsIgnoreCase("2")){
            }
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
