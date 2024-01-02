package inheritance;

public class Bicycle{

    String color;
    int maxSpeed;
}

package inheritance;

public class Car extends Vehicle{

    int numDoors;
    int numGears;

    public Car(){
      //super(100);
      System.out.println("Car's Constructor");
      numDoors=4;
      numGears=5;
    }

    public Car(int numDoors, int maxSpeed){
      super(maxSpeed);
      System.out.println("Car's Constructor");
      this.numDoors = numDoors;
    }

    public void print(){
      super.print();
      System.out.println("Car numDoors"+ numDoors+ "numGears"+numGears);
    }

    public void printMaxSpeed(){
      maxSpeed=150;
      System.out.println(maxSpeed+" "+maxSpeed);
    }
}

package inheritance;

public class Vehicle{

    private String color;
    int maxSpeed;

    public Vehicle(){
      System.out.println("Vehicle's Constructor");
      maxSpeed= 60;
    }

    public Vehicle(int maxSpeed){
      System.out.println("Vehicle's Constructor");
      this.maxSpeed- maxSpeed;
    }

    public String getColor(){
      return color;
    }

    public void setColor(String color){
      this.color=color;
    }

    public void print(){
      System.out.println("Vehicle"+"color"+color)
    }
}
package inheritance;

public class VehicleUse{

    public static void main(String[] args){
        Vehicle v= new Vehicle();
        v= new Car();
        v.print();
    }
}

