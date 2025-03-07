public class Return{
	public static int addTwoNumbers (int x , int y){
		return x + y;
	}
	
	public static String stringReturn (String a , String d){
		return a + d;
	}
	
	public static double addTwoDoubles (double q , double j){
		return q + j;
	}
	public static void main(String[] args){
		int total = addTwoNumbers(5,7);
		System.out.println(total);
		
		String cha = stringReturn("Damidu " , "Abeysinghe");
		System.out.println(cha);
		
		Double dd = addTwoDoubles(22.56 , 33.7);
		System.out.println(dd);
	}
}