public class Constructors {
    
    int modelNumber;
    String modelName;
   
    public Constructors(int modelNumber, String modelName) {
        this.modelNumber = modelNumber;
        this.modelName = modelName;
    }
    
    public static void main(String[] args) {
        Constructors myPhone1 = new Constructors(22, "Samsung");  // Changed Mai to Main
        Constructors myPhone2 = new Constructors(14, "Iphone");   // Changed Mai to Main
        System.out.println("My Phone is "+ myPhone1.modelName + " " + myPhone1.modelNumber);
        System.out.println("My second Phone is "+ myPhone2.modelName + " " + myPhone2.modelNumber);
    }
}