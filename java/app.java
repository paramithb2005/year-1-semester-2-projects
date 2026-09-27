class App{
    public static void main(String[] args){
        Calculator obj1 = new Calculator();
        obj1.addNumbers();
        obj1.subNumbers(50,8);
         System.out.println("Division of two numbers is: " + obj1.divNumbers());
    }
}