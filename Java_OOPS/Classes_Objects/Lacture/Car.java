
// Making the class car...
public class Car {

    // Declearing the object in the Class Car...
    int numOfWheels;
    float maxSpeed;
    float fuelInLiters;
    float currentFuelInLiters;
    String name;
    String Color;
    String modelNumber;
    int numberOfSeats;
    // These above are instance variables... 
    // Note : Here we declearing the objects that basically store in the Stack not in the Heap...

    Car(String Color){ // This will set the default value of the car this is called as constractor...
        maxSpeed = 150;
        name = "Maruti";
        currentFuelInLiters = 3;
        this.Color = Color;
        modelNumber = "a1v4";
        numberOfSeats = 5;
    }

        // Note : Constructor Chaining is Basically when two or more Constractor call other Constractor for their work implimentation...

    Car(){
        this.Color = "Black"; 
        /* Note : Here we not calling the constraction by name insted we call using this..,
         * this basically replace the Car with this Keyword... there is some rules
         *  how we can use the constuctor Chaining Please refer to the notes....         */
        currentFuelInLiters = 5; // This basically perfer the property of this {}...[Referance no. 1]
    }




    public Car Started(){
        if(currentFuelInLiters==0){
            System.out.println("Car is out of Fuel...");  // With the help of constractor at start Car has 3 liters default fuel...
        }else if(currentFuelInLiters<5){
            System.out.println("Car is at Reserved mode, Please refuel...");
            currentFuelInLiters--;
        }else{
        System.out.println("Car is Started...  'Bruhhh'...");
        currentFuelInLiters--;
        } 
        return this;
        // Note : This will generally call in case of constractor...
    }

    public void Drive(){
        currentFuelInLiters--;
        System.out.println("Car is Driving...");
    }
    public  void fuel(float currentFuelInLiters){
        this.currentFuelInLiters+=currentFuelInLiters;
    }


    public void addFuel(float Fuel){
        currentFuelInLiters += Fuel;
    }

    public float getFuelStatus(){
        return currentFuelInLiters;
    }
}
