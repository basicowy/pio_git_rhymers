package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int IF_EMPTY_RETURN = -1;
    private final int[] NUMBERS = new int[CAPACITY];

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getEmptyRhymerIndicator() {
        return EMPTY_RHYMER_INDICATOR;
    }

    public static int getIfEmptyReturn() {
        return IF_EMPTY_RETURN;
    }

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY_RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY_RETURN;
        return NUMBERS[total--];
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }
}
