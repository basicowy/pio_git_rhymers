package edu.kis.vh.nursery;
/**
 * klasa HanoiRhymer dodaje o logike wież Hanoi.
 * nie pozwala ona na dodawanie wartości większej niż ta która aktualnie znajduje się na szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * początkowa wartość licznika odrzuconych elementów.
     */
    private static final int INITIAL_REJECTED_VALUE = 0;
    /**
     * licznik przechowujący sumę elementów, które nie zostały przyjęte do wyliczanki.
     */
    private int totalRejected = INITIAL_REJECTED_VALUE;

    /**
     * sprawdza, czy wyliczanka jest pełna.
     * *@return true, jeśli osiągnięto limit pojemności, false w przeciwnym razie.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * dodaje liczbę do wyliczanki, sprawdzając zasadę wież Hanoi.
     * jeśli dodawana liczba jest większa od obecnej na szczycie zostaje ona odrzucona i zwiększa licznik
     * *@param in wartość int, którą próbujemy umieścić w wyliczance
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
