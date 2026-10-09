public class carApp {
    //keep main method

    public static void main(String[] args) {
        //Create Object
        car obj1 = new car();
        obj1.displayinfo();

        car obj2=new car(2024,"BMW",50000.00);
        obj2.displayinfo();

        car obj3=new car(2023,"Toyota",30000.00);
        obj3.displayinfo();
    }
}
