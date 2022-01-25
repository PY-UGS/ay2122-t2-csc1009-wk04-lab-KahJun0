public class StackOfIntegers {
    private int[] elements;
    private int size = 0;

    public StackOfIntegers() {
        elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean IsEmpty(){
        return (size==0);
    }

    public int Peek(){
        if (size == 0){
            return elements[size];
        }
        else{
            return elements[size-1];
        }
    }

    public void Push(int value){
        elements[size] = value;
        size += 1;
    }

    public int Pop(){
        if (size==0){
            return elements[size]; // Return first element since size is 0
        }
        else{
            int valueToReturn = elements[size-1]; // Get value into a temp variable
            elements[size-1]=0; // Removes variable from array
            size--; // Decrements size of stack
            return valueToReturn; // Return value
        }
    }
}
