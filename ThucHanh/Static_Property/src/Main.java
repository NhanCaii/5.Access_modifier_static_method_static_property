public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1= new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.engine);

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }

    public static class Car{
        private String name;
        private String engine;
        public static int numberOfCars;
        public Car(String name, String engine){
            this.name=name;
            this.engine=engine;
            numberOfCars++;
        }
    }
}