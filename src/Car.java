import java.time.Year;

public class Car extends Vehicle {
    private int doorsNumber;
    private int productionYear;
    private int currentYear = Year.now().getValue();

    public Car(String vehicleModel, int engineSize, int horsePowers, String engineType, int doorsNumber, int productionYear) {
        super(vehicleModel, engineSize, horsePowers, engineType);
        this.doorsNumber = doorsNumber;
        this.productionYear = productionYear;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    @Override
    double registrationPrice() {
        double price = 0;
        if(this.getEngineType().equalsIgnoreCase("electric")){
            price = 5000;
        }else if(this.getEngineType().equalsIgnoreCase("diesel") || this.getEngineType().equalsIgnoreCase("gasoline")){
            price = 10000;
        }
        if(this.getEngineSize() > 2000){
            price += price * (40/100);
        }
        if(getCurrentYear() - getProductionYear() > 5){
            int increase = getCurrentYear() - getProductionYear() - 5;
            for(int i = 0; i < increase; i++){
                price = price * 1.05;
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return
                "Car: " +
                        super.toString() +
                        "number of doors: " + doorsNumber ;
    }
}
