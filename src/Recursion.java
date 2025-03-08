public class Recursion{
	public static void main(String[] args) {
        int total = sum(10);
        System.out.println(total);	
	}
	public static int sum(int num){
		if (num > 0){
		return num + sum(num -1); 
		
		}
		else {
                return 0;		
            }
	}
}