public class Static    {

	public static void staticMethod(){
		System.out.println("This is static");
	}
	
	public void publicMethod(){
		System.out.println("This is public");
            //apit ekata object ekak hadanna ona nkn acess krnna bh static wachne eka nathi nisa
		
	}

  public static void main(String[] args) {
	  	staticMethod(); // Can call static method directly
		Static myObject = new Static(); // Create an instance of Static class
		myObject.publicMethod(); // Use the instance to call non-static method
    
  }
   
}