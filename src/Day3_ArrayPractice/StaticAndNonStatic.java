package Day3_ArrayPractice; 
public class StaticAndNonStatic {
    static int staticVariable = 10;
    int nonStaticVariable = 20;

    public static void main(String[] args) {
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.displayVariables();
    }
    public void displayVariables() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Non-Static Variable: " + nonStaticVariable);
    }
}
// in both method it accesable in both static and non static
// static method can access static variable directly
// non-static method can access both static and non-static variables directly
// static method cannot access non-static variable directly
// to access non-static variable in static method, we need to create an object of the class

