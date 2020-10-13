public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(50,20);
        cars[1] = new Car(20,20);
        cars[2] = new Car(90,20);

        System.out.println(name(cars));

    }
    public static int name(Car[] cars){
        int temp = 0;
        for(int i=0; i<cars.length;i++){
            if(cars[i].getSpeed()>=temp){
                temp = cars[i].getSpeed();
            }
        }
        return temp;

    }

    static class Car{
        int speed;
        int accel;

        public Car(int speed, int accel) {
            this.speed = speed;
            this.accel = accel;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getAccel() {
            return accel;
        }

        public void setAccel(int accel) {
            this.accel = accel;
        }
    }
}
