package JAVA_Practice;
class MyException extends Exception
{
    public MyException(String str)
    {super(str);
       System.out.println(str);
       
    }
}
public class CustomException_Advance {

public static void main(String[] args) {
    int j=0;
try
{
   
   int num=j/2;
   if(j==0)
     throw new MyException("This is an exception"); //throw can only be used with if condition
   
}
catch(MyException e)
{
    System.out.println("Catched an exception"+e);
}
}
}
