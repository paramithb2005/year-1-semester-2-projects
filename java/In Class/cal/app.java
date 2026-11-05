package cal;

public class app {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(10,20);
        c.add(10.5,20.5);
        c.add(10,20,30);
        c.add("Hello","World");
    }
    
}
