public class ForEach {
	public static void main (String[] args){
		String[] fruits = {"Apple","orange","banana","grapes"};
		for (String i : fruits) {
			System.out.println(i);
		}
		
		for ( int q = 0; q <fruits.length; q=q+1){
		System.out.print(" " + fruits[q]);
		}
		
	}
}