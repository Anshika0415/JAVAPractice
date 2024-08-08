package JAVA_Practice;

class Hi extends Thread
{
    public void run()
    {
        for(int i=0;i<30;i++)
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
class Hello extends Thread
{
    public void run()
    {
        for(int i=0;i<30;i++)
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
public class Threads_Advance {
    public static void main(String[] args) 
    {   
        Hi a=new Hi();
        Hello b=new Hello();
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
       
    }
}
