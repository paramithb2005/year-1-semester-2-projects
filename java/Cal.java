class Calculator{
    int num1  = 20;
    int num2 = 10;
    //method 1
    //non parameterized
    //non return type
    void addNumbers(){
        //method scope
        int tot = num1 + num2;
        System.out.println("Addition of two numbers is: " + tot);
    }
    //method 2
    //parameterized
    //non return type
    void subNumbers(int a,int b){
        int sub = a - b;
        System.out.println("Subtraction of two numbers is: " + sub);
    }

    //method 3
    //non parameterized
    //parameterized return type
    int divNumbers(){
        int divid = num1/num2;
        return divid;
    }
    //method 4
    //parameterized
    //parameterized return type
    int mulNumbers(int a){
        int mul = a * num2;
        return mul;
    }
}