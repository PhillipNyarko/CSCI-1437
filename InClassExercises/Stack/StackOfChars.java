public class StackOfCharacters {
    private char[] elements;
    private int size;

    public StackOfCharacters() {
        elements = new char[4];
    }

    public StackOfCharacters(int capacity) {
        elements = new char[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public char peek() {
        return elements[size - 1];
    }

    public void push(char value) {
        elements[size] = value;
        size++;
    }

    public char pop() {
        char temp = elements[size - 1];
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }
}
