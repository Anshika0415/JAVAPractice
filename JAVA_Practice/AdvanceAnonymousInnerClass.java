package JAVA_Practice;
abstract class Demoa
{
    abstract void config();
    
}
class Demo
{
    void show()
    {
        System.out.println("Demo class");
    }
}

public class AdvanceAnonymousInnerClass {
    public static void main(String[] args) 
    {
        Demo d=new Demo()
     {
        void show()
          {
             System.out.println("Anonymous class");
          }
     };
     Demoa da=new Demoa() // anonymous class for abstract class bcz abstract class can't be instanciated
     {

        @Override
        void config() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'config'");
        }
        
     };

     d.show();
    }
     
}
