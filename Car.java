public class Car {
    //properties
    int year;
    String model;
    //constructor
    public Car(int yearVar, String carModel) {
        this.year = yearVar;
        this.model = carModel;
    }
    //method
    public void printCarInfo() {
        System.out.println("I am a car of model" +
                this.model + "and year: " + this.year);
    }
    Car x = new Car(1992, "Hundai");
    Car y = new Car(1956, "Toyota");



//    y.printCarInfo();
//    x.printCarInfo();
}

