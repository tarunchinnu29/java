  
 interface player
 {

   void sum();
}
 
 class second implements player{
     public void sum()
         {
             System.out.println("do nothing");
         }
 }
  class three{
public static void main (String args[])
{
second obj=new second();
obj.sum();
}
  }