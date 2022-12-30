import java.time.Year;

public class Motorcycle extends Vehicle{
    private int productionYear;
    private int currentYear = Year.now().getValue();

    public Motorcycle(String vehicleModel, int engineSize, int horsePowers, String engineType, int productionYear) {
        super(vehicleModel, engineSize, horsePowers, engineType);
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    @Override
    double registrationPrice() {
        double price = 5000;
        if(getEngineSize() < 50 & (getCurrentYear() - getProductionYear()) > 1){
            price = 1000;
        }
        return price;
    }

    @Override
    public String toString() {
        return
                "Motorcycle: " +
                        super.toString();
    }
}
