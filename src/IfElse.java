public class IfElse {
    public static void main (String[] args) {
        int marks = 70;
        
        if (marks >=75) {
            System.out.println("A");
        }
            else if (marks >=65)    {
                System.out.println("B");
        }
            else if (marks >= 55)   {
                System.out.println("C");
        }
            else if (marks >= 35)   {
                System.out.println("S");
        }
            else {
                System.out.println("F");
        }



       	int Nmarks = 90;
	        String results = (Nmarks >= 50)? "pass" : "failed" ;
		            System.out.println(results);


    }
}