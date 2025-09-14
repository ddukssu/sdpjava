public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .brand("Audi")
                .model("A3")
                .color("black")
                .engine("TFSI 2.0 litre four cylinder turbo")
                .seats(5)
                .build();

        System.out.println(car);
    }
}
