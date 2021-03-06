package gnohr.drex.perceptiontest;

import java.util.ArrayList;
import java.sql.Time;

public class perceptionDatum<T extends Number> {
    //records the time at which the answer was submitted (or timeout reached)
    private Time timeCompletedAt;
    //Did the user select the correct answer:
    private boolean passed;
    //Stores the values of the 2 stimuli
    private T value1;
    private T value2;

    public perceptionDatum(Time timeCompletedAt, boolean passed, T value1, T value2) {
        this.timeCompletedAt = timeCompletedAt;
        this.passed = passed;
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean isSuccess() {
        return passed;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }
}
