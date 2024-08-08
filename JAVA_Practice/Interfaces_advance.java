 /*there are 3 types of interfaces 1. normal interface  2. Functional/SAM Single Abstract
Method  3. Marker Interface.... this interface is blank and is used in giving permission 
for serialisation--> saving obj data to hard drive and deserialisation--> reteriving data 
from hard drive */

package JAVA_Practice;
interface Computer                                           
{                                            
    void code();
}
class Laptop implements Computer
{

    @Override
    public void code() {
       System.out.println("coding");
    }
    
}
class Desktop implements Computer
{

    @Override
    public void code() {
       System.out.println("coding faster !");
    }
    
}
class Dev
{
    void applyCode(Computer comp)
    {
         comp.code();
    }
}
public class Interfaces_advance {
    public static void main(String[] args) {
        Computer lap=new Laptop();
    Computer desk=new Desktop();
    Dev d=new Dev();
    d.applyCode(desk);
    }
    

}
