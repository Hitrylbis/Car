public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    void start (){
        System.out.println(brand + " Has been started");
    }
    void setAcceleration (float acceleration){
        this.acceleration = acceleration;
        System.out.println(acceleration);
    }
    float countSpeed (float time){
        return (100/acceleration) * time;
    }
}
