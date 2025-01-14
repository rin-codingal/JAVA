//Creating a interface
interface Vehicles {      
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

//use keyword implements to inherit a interface
class Bicycle implements Vehicles{
      
    int speed;
    int gear;
      
     // to change gear
    @Override
    public void changeGear(int newGear){
          gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
         System.out.println("speed: " + speed);
         System.out.println(" gear: " + gear);
    }
}
  
class Car implements Vehicles {
      
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
        System.out.println("speed: " + speed);
        System.out.println(" gear: " + gear);
    }
      
}
class Vehicle {
      
    public static void main (String[] args) {
      
        // creating an instance of Bicycle 
        // doing some operations 
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
          
        System.out.println("Bicycle present state :");
        bicycle.printStates();

        System.out.println("");
          
        // creating instance of the car.
        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);
          
        System.out.println("Car present state :");
        car.printStates();

        System.out.println("");
    }
}