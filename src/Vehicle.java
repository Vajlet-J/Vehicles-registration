abstract class Vehicle {
    private String vehicleModel;

    private String vehicleBrand;
    private int engineSize;
    private int horsePowers;
    private String engineType;

    public Vehicle(String vehicleBrand, String vehicleModel, int engineSize, int horsePowers, String engineType) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.engineSize = engineSize;
        this.horsePowers = horsePowers;
        this.engineType = engineType;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    abstract double registrationPrice();

    @Override
    public String toString() {
        return  vehicleBrand + "\n" +
                vehicleModel + "\n" +
                "engine size: " + engineSize + "\n" +
                "horse powers: " + horsePowers + "\n" +
                "engine type: " + engineType + "\n";
    }
}
