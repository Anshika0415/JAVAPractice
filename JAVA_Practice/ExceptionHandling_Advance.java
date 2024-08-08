package JAVA_Practice;

public class ExceptionHandling_Advance {
public static void main(String[] args) {
    int i=9;
    int j=0;
    int[] arr=new int[5];
    String str=null;
    try{
        j=j/i;
        if(j==0)
        throw new ArithmeticException("do not divide by zero");  //to throw exception forcefully
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(str.length());
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("select smaller number");

    }
    catch(ArithmeticException e){
        j=j/1;
        System.out.println("This is a default value"+e);
        System.out.println("Cannot divide by zero");

    }
    catch(NullPointerException e){
        System.out.println("Value is null");

    }
    catch(Exception e){
        System.out.println("Something went wrong"); //parent exception class should go in the bottom

    }
    System.out.println(j);
}
}
