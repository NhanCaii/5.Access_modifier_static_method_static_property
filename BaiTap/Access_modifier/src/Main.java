public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TestCircle cir= new TestCircle(4.0);
        System.out.println(cir.getArea());
    }

    public static class Circle{
        private double radius=1.0;
        private String color="red";

        Circle (){}
        Circle (double r){
            this.radius=r;
        }
        public double getRadius() {
            return radius;
        }
        public double getArea(){
            return radius*radius*Math.PI;
        }
    }
    public static class TestCircle extends Circle{
        public TestCircle(double v) {
        }

        public double TestCircle(double radius){
            return getArea();
        }
    }
}