public class Stack {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++) {
            stack.Push(i);
        }
        while (!stack.IsEmpty()){
            System.out.print(stack.Pop() + " ");
        }
    }
}
