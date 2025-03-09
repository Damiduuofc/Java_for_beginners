public class AcessMethod    {

    public void fullThrottle(){
        System.out.println("The car going at the maximum speed");
    }
   
   
   
   public void speed(int maxSpeed){
       System.out.println("MAx Speed is " + maxSpeed);
   }
   
   public static void main(String[] args){
       AcessMethod myCar = new AcessMethod();
       myCar.fullThrottle();
         // You can also call the speed method if you want:
             // myCar.speed(200);
           
           myCar.speed(60);
   }
  
}