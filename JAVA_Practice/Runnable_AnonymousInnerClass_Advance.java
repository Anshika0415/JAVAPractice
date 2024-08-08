package JAVA_Practice;

public class Runnable_AnonymousInnerClass_Advance {
    public static void main(String[] args) 
    {   
        Runnable a=()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Hi");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }; //reference of parent class/interface nd instance of child class
        Runnable b=()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(a);//parameterized constructor
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
       
    }
}
