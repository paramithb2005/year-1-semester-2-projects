public class car {
    //instance variable
    int year;
    String brand;
    double price;

    //constructor = a method like class name 
    //Non parameterized method

    car(){
        year=2000;
        brand="Unknown";
        price=0.00;
    }
    
    //parameterized constructor
    
    car(int year, String brand, double price){

        this.year=year;
        this.brand=brand;
        this.price=price;
    } 

    void displayinfo(){
        System.out.println("Year"+year)
        System.out.println("Brand"+brand);
        System.out.println("Price"+price);

    }





    
}
