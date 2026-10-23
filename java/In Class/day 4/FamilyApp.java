public class FamilyApp{
     public static void main (String[] args){
         farther f1 = new farther();
         f1.car = "Car";
         f1.phone = "Phone";
         f1.trave();
         f1.call();

         System.out.println("_________SON____________");
         son s1 = new son();
         s1.car = "Car";
         s1.phone = "Phone";
         s1.trave();
         s1.call();

         daugh d1 = new daugh();
            d1.car = "Audi";
            d1.phone = "Apple";
            d1.laptop = "Dell";
            d1.bike = "NS200";
            d1.work();
            d1.trave();
            d1.call();


        gfarther g1 = new gfarther();
        g1.gphone = "yamaha";
        g1.gcall();


     }
}