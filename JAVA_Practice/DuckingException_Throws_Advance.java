package JAVA_Practice;
class Duck{
    public void show() throws ClassNotFoundException //now since main is calling show method so main needs to handle the error
    {
    //     try
    //     {
    //         Class.forName("Bird");
    //     }
    //     catch(ClassNotFoundException e)
    //     {
    //         System.out.println("error aa gyi!");
    //     }
    // }
    System.out.println(Class.forName("Bird"));
}}

public class DuckingException_Throws_Advance {
public static void main(String[] args) {
    Duck d=new Duck();
    try {
        d.show();
    } catch (ClassNotFoundException e) {
        System.out.println("error has been found dont panic");
    }
}
}
