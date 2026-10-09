class bookApp {
    //Kepp  main method

    public static void main(String[] args) {
        // object 
        // reference class | object name = new|
        // constructor => class name like method();
        book b1 = new book();
        b1.title="Madolduwa";
        b1.author="Martin Wickramasinghe";
        b1.price=500.00;
        b1.pages=300;
        b1.displayDetails();
    }
}