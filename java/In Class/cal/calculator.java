package cal;

public class calculator {
    int add(int a,int b){
        int result=a+b;
        System.out.println("Addition of two numbers is: "+result);
        return result;
    }
    double add(double a,double b){
        double result=a+b;
        System.out.println("Addition of two numbers is: "+result);
        return result;
    }
    int add(int a,int b,int c){
        int result=a+b+c;
        System.out.println("Addition of three numbers is: "+result);
        return result;
    }
    String add(String a,String b){
        String result=a+b;
        System.out.println("Addition of two strings is: "+result);
        return result;
    }
}
