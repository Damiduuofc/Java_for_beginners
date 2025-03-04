public class Stringmethods {
    // . ekk ghuwa gamn eken ee text ekk ho varible eka assat ynnwa wge seen ekk wennwa

    public static void main (String[] args) {
        String text = "Hello world.";
        System.out.println(text);
        System.out.println(text.length());
        System.out.println("My string is: " + text);
        System.out.println(text.indexOf("world")); // programming lanague wala index eka patn ganne 0 wen


        String fristName = "Damidu";
        String lastName = "Abeysinghe";

        System.out.println(fristName + " " + lastName);
        System.out.println(fristName.concat(lastName));

        String backslash = "damidu said, \"it's easy\" "; // backslash eka use krnna ona udukoma eka print krnna
        String backslash2 = " \\"; //backslash eka print krnna oni nm ekn 2 ghnn oni 
        System.out.print(backslash);
        System.out.println(backslash2);

        String text2 = "Hello\nworld.";  // peli dekakt kadann oni nm
        String text3 = "Hello\tworld.";
        String text4 = "Hello\t\nworld.";
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

    }
}
