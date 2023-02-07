public class StackOfCharacters {
    private char[] elements; // create an array that holds char values
    private int size; // create integer variable to track the size(number of filled spaces) of the array

    public StackOfCharacters() { // no args constructor initialized elements array with 4 empty indices
        elements = new char[4];
    }

    public StackOfCharacters(int capacity) { // parameterized constructor initialized elements array with (n) empty indices
        elements = new char[capacity];
    }

    public boolean empty() { // empty method checks if the list has any indices occupied
        return size == 0;
    }

    public char peek() { // returns the character at the top of the stack (last in).
        return elements[size - 1];
    }

    public void push(char value) { // adds new character to the end of the stack and updates the size counter
        elements[size] = value;
        size++;
    }
    /* returns the last index and decrements the size so that the last previously occupied index
    appears empty and can be overwritten with a new character */
    public char pop() {
        char temp = elements[size - 1];
        size--;
        return temp;
    }

    public int getSize() { // return the current number of filled indices of the stack
        return size;
    }
}
