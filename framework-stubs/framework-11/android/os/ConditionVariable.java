package android.os;

public class ConditionVariable {
    private volatile boolean mCondition;
    public ConditionVariable() {}
    public ConditionVariable(boolean p0) {}
    public void open() {}
    public void close() {}
    public void block() {}
    public boolean block(long p0) { return false; }
}
