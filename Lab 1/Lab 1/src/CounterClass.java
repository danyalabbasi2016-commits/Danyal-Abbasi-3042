public class CounterClass {
    private static int objectCounter = 0;
    private int objectNumber;

    public CounterClass() {
        objectCounter++;  // Increment the counter
        objectNumber = objectCounter;  // Assign unique number to this object
        System.out.println("I am object no. " + objectNumber);
    }

    // Method to get total objects created
    public static int getTotalObjects() {
        return objectCounter;
    }

    // Method to get this object's number
    public int getObjectNumber() {
        return objectNumber;
    }

}