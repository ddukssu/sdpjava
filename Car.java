public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int seats;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return brand + " " + model + " with " + engine + " engine, color " + color + ", seats: " + seats;
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String color;
        private String engine;
        private int seats;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
