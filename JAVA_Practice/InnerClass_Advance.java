package JAVA_Practice;
class Abc
{
    void show()
    {
        System.out.println("showing..");
    }
    class Bcd
    {
        void innerShow()
        {
            System.out.println("inner class me hain");
        }
    }
}

public class InnerClass_Advance {
    public static void main(String[] args) {
        Abc obj=new Abc();
        obj.show();
        Abc.Bcd obj1=obj.new Bcd();
        obj1.innerShow();
    }

  
}
