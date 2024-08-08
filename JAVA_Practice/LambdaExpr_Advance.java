package JAVA_Practice;

@FunctionalInterface
interface Inter
{
    void show();
}

@FunctionalInterface
interface Intera
{
    void showa(int a);
}
@FunctionalInterface
interface Interb
{
    int showa(int b);
}

public class LambdaExpr_Advance {
    public static void main(String[] args) {
        Inter obj =()->{System.out.println("this arrow is lambda expression");};

        Intera obja=(int a)->{System.out.println("this is parameterized "+a);};

        Interb objb=(int b)->
        {int m=b*b;
         return m;   
        };
        obj.show();
        obja.showa(3);
        int m=objb.showa(8);
        System.out.println(m);
    }
}
