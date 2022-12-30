public class Truck extends Vehicle{
    private int trailers;

    public Truck(String vehicleModel, int engineSize, int horsePowers, String engineType, int trailers) {
        super(vehicleModel, engineSize, horsePowers, engineType);
        this.trailers = trailers;
    }

    public int getTrailers() {
        return trailers;
    }

    @Override
    double registrationPrice() {
        return 10000 + 7000 * getTrailers();
    }

    @Override
    public String toString() {
        return
                "Truck: " +
                        super.toString() +
                        "number of trailers: " + trailers ;
    }
}
