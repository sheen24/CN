//vehicle class
package inheritance;

public class Vehicle{

    private String color;
    public int maxSpeed;

    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's Constructor")
        this.maxSpeed = maxSpeed;
    }

    public String getColor(){
      return color;
    }

    public void setColor(String color){
      this.color = color;
    }

    public void print(){
        System.out.println("Vehicle "+ " color "+ color+" maxSpeed "+ maxSpeed);
    }
}
//car class
package inheritance;

public class Car extends Vehicle{

    int numDoors;
//    int maxSpeed;

    public Car(int numDoors, int maxspeed){
      //super(maxspeed);
      System.out.println("Car's Constructor");
      this.numDoors = numDoors;
    }

    public void print(){
        super.print();
        System.out.println("Car "+ " numdoors "+ numDoors);
    }

    public void printMaxspeed(){
        super.maxSpeed = 15;
        System.out.println(maxSpeed+ " " + super.maxSpeed);
    }
}
//vehicle use class
package inheritance;

public class VehicleUse{

    public static void main(String[] args){

      Object o= new Vehicle(100);
      Vehicle v= new Vehicle();
      
    //Vehicle v= new Car(4, 100);
  //  Car c= (Car) v;
  //  c.numDoors=3;

      //Vehicle v;
      //Scanner s= new Scanner(System.in);
      //int n= s.nextInt();
      //if(n<10){
    //      v= new Car(4, 100);
      //}else{
      //    v= new Vehicle();
    //  }
    //  v.print();

    //  Car c= new Vehicle();

      //v.maxSpeed= 100;
      //v.numDoors= 4;

      //Car c= new Car(4, 100);
      //c.print();


        //Vehicle v= new Vehicle();
        //v.color= "Red";
        //v.setColor("red");
        //v.maxSpeed= 80;
        //v.print();

        //Car c= new Car();
        //c.color= "Black";
        //c.setColor("black");
        //c.maxSpeed = 100;
        //c.numDoors= 4;
        //c.printMaxSpeed();
        //c.print();
        //c.printCar();

        //Bicycle b= new Bicycle();
        //b.print();
    }
}
