//class
public class Calculator {
   //class scope 
   int num1 ;
   int num2 ;

   //Create Default Constructor
   Calculator(){
      num1 = 2;
      num2 = 3;
   }

   Calculator(int a,int num2){
      num1 = a;
      this.num2 = num2;

   }
   //Non Para Non Return Type Method

   void add(){
      int ans = num1 + num2;
      System.out.println(ans);
   }

   public static void main(String[]args){ 
      Calculator anura = new Calculator();
      anura.num1 = 10;
      anura.num2 = 20;

      System.out.println(anura.num1);
      System.out.println(anura.num2);

      //Method Calling

      anura.add();

      System.out.println("---------------------");

      Calculator ranil = new Calculator();
      ranil.num1 = 30;
      ranil.num2 = 40;

      System.out.println(ranil.num1);
      System.out.println(ranil.num2);

      ranil.add();

      System.out.println("---------------------");

      Calculator gota = new Calculator( 70,80);
      System.out.println(gota.num1);
      System.out.println(gota.num2);

      gota.add();
      
   }
}
