package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int MINUS_ONE = -1;
    private int[] NUMBERS = new int[SIZE];
    
    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total--];
    }

}
