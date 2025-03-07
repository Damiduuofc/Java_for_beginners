public class OverLoading{
	public static int addTwoNumbers (int x , int y){
		return x + y;
	}
	
	public static double addTwoDoubles (double x , double y){
		return x + y;
	}
	public static void main(String[] args){
		int total = addTwoNumbers(5,7);
		System.out.println(total);
		
		Double dd = addTwoDoubles(22.56 , 33.7);
		System.out.println(dd);
	}
}