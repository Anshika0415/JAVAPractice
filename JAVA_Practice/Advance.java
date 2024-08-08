package JAVA_Practice;

abstract class Smartphone
{
    abstract public void appleTV();
    abstract public void dynamicIsland();
     void callPeople()
     {
        System.out.println("Calling...");
     }
    
}
class Iphone13 extends Smartphone
{
    public void appleTV()
    {
        System.out.println("Playing movie...");
    }

    
    public void dynamicIsland() {
    }
}

class Iphone14 extends Iphone13
{
    public void dynamicIsland()
    {
        System.out.println("Face identified...");
    }
}
public class Advance {
    public static void main(String[] args) {
        Smartphone sm=new Iphone14();
        sm.appleTV();
        sm.callPeople();
        sm.dynamicIsland();

    }

}
