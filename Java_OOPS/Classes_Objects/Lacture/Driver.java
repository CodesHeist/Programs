// This class besically access the Car.java File in which Car class is held 
// Use the property of the class car
// Since here the actual interaction between the classes takes place...

public class Driver {
    String name;
    int age;
    String dateOfDrivreLicense;
    static int minAgeforDriving = 18;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeforDriving;
    }
    
    public static void main(String[] args) {
        // here creating the myCar as an object that access the Car Class property...
        // Car myCar = new Car();
        // myCar.Start();
        // System.out.println(myCar.currentFuelInLiters);
        // myCar.addFuel(6);
        // myCar.getFuelStatus();
        // System.out.println(myCar.currentFuelInLiters);
        // myCar.Drive();
        // myCar.Drive();
        // myCar.Drive();
        // myCar.addFuel(3);
        // myCar.Drive();
        // System.out.println(myCar.currentFuelInLiters);


        System.out.println("\nHere is the Case of the Car object 'Swift'\n ");


        Car Swift = new Car("Red");
        // Swift.addFuel(7); // Here if we  dont add the feul at start the car will drive because- 
                             // -we added the default value with the help of constractor...
        Car Started = Swift.Started();
        System.out.println(Swift.Color);
        Swift.Drive();
        Swift.Started().Drive();
        Swift.Started().fuel(3);
        Swift.addFuel(7);



        System.out.println("\n\nHere is the Case of new Object that is 'Thar'\n\n ");
        // Here we creating the new Car that is "Thar" to experiment the Concept of Constractor Chaining...
        Car Thar = new Car();
        System.out.println(Thar.Color);
        System.out.println(Thar.currentFuelInLiters); /*  This will perfer the input which we pass during calling the Constructor..
        Please refer[Referance no. 1]*/

        // Creating the object of the Driver to access the minAge,DotLicense,Name...
        Driver myDriver = new Driver();
        myDriver.dateOfDrivreLicense = "11/07/2025";
        minAgeforDriving = 18;




    }
}
