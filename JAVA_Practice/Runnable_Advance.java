package JAVA_Practice;
class Hii implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class Helloo implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

   


public class Runnable_Advance {
    public static void main(String[] args) 
    {   
        Runnable a=new Hii(); //reference of parent class/interface nd instance of child class
        Runnable b=new Helloo();
        Thread t1=new Thread(a);//parameterized constructor
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
       
    }

}
