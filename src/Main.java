public class Main {
    public static void main(String[] args) {
        Car mazda = new Car("Mazda",190,false,10);
        Car lada = new Car("Lada",120,false, 20);
        System.out.println(mazda.countSpeed(5));
        System.out.println(lada.countSpeed(5));

    }
}
