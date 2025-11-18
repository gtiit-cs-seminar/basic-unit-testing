package util;

public class Example2 {
    // Create a series of methos that are easy for randoop but hard for evosuite
    // For example, methods that are easy to reach with random inputs but hard to reach with
    // guided search 
    // For instance, you need to reach certain number of method calls to reach a certain state
    // Use a counter that is incremented with each method call
    private  int counter = 0;
    public boolean randoopFriendlyButEvoHard() {
        counter++;
        if (counter < 30) {
            return false;
        }
        // Reset counter for next call
        counter = 0;
        return true;
    }
}
