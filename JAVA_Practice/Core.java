package JAVA_Practice;

class Calculator
{
   int calc(int x,int y)
   {
    return x+y;
   }
   public void playMusic()
   {
    System.out.println("Playing music..");
   }
}
class Student
{
    int roll;
    String name;
    int marks;
}
class Mobile
{
    static String name;
    int price;
    void show()
    {
        System.out.println(name + " " +price);
    }
}
class DogBreed
{
    String name;
    int price;
    static void show(DogBreed obj)
    {
        System.out.println(obj.name + " " +obj.price);
    }

}

class A
{
    //parent class
    
   A()
   { //super() by default in every constructor
     System.out.println("A class constructor");
   } 
   A(int x)
   { //super()
     System.out.println(x + "A class parameterized constructor");
   } 
    
   void playGame()
   {
    System.out.println("I play game like A");
   }
   void eat()
   {
    System.out.println("I eat like A");
   }

}
class B extends A
{
     // child class
     B()
   { super(4);
     System.out.println("B class constructor");
   } 

   void dance()
   {
    System.out.println("i dance like a B");
   }
   void playGame()
   {
    System.out.println("i play game like a B");
   }
}
public class Core
{
    public static void main(String [] args){
        // {   Calculator c= new Calculator();
        //     int z= c.calc(9, 8);              //methods
        //     System.out.println(z);
        //     c.playMusic(); 
        //     int[] arr =new int[3];
        //     arr[0]=4;

// Student s1=new Student();
// Student s2=new Student();
// Student s3=new Student();
// s1.roll=1;
// s1.name="strangel";
// s1.marks=11;                                  
//         Student studs[]=new Student[3];          //object as array
//         studs[0]=s1;
//         for(int i=0;i<1;i++)
//         {
//             System.out.println(studs[i].roll);
//             System.out.println(studs[i].name);
//             System.out.println(studs[i].marks);
        
        // StringBuffer sb =new StringBuffer("anshika");          //string buffer and builder
        // System.out.println(sb);
        // sb.append(" gupta");
        // System.out.println(sb);
// Mobile s1=new Mobile();
// Mobile.name="apple iphone";
// s1.price=100;
// Mobile s2=new Mobile();                      //static variable
// Mobile.name="apple iphone";
// s2.price=330;
// s1.show();
// s2.show();
        // DogBreed s1=new DogBreed();
        // s1.name="German Shephard";
        // s1.price=100;
        // DogBreed s2=new DogBreed();                 //static method
        // s2.name="Pomerian";
        // s2.price=300;
        // DogBreed.show(s1);
        // DogBreed.show(s2);

    
    B b=new B();
    A obj=new B();
    obj.playGame();
   obj.eat();
    }
}