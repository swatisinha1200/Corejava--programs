 class Car {
    String model;
    String color;
    int year;

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.color = "Red";
        myCar.year = 2020;
        myCar.displayInfo();
    }
}