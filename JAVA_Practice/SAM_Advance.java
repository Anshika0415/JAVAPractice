//in this use concept of anonymous inner class
//interfaces can't be instantiated
package JAVA_Practice;
@FunctionalInterface 
interface ABCD {
  void show();
    
 }

public class SAM_Advance {
    public static void main(String[] args) {
        ABCD obj=new ABCD() {

            @Override
            public void show() {
                System.out.println("interface ka object");
            }
            
         };
         obj.show();
    }
 
}
