public class ModifiersFinal {

	final int x = 10;
	  final double PI = 3.14;
	// final kyala tynna nisa code palleha api wenn m modify krnn haduwoth run kradi error ekk ennwa

	public static void main (String[] args){
		ModifiersFinal myObj = new ModifiersFinal();
		// myObj.x = 50; // will generate an error: cannot assign a value to a final variable
		   // myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
		    System.out.println(myObj.x);
	}
}

/* If you don't want the ability to override existing attribute values, declare attributes as final:
*/