package android.os.strictmode;

public class InstanceCountViolation extends android.os.strictmode.Violation {
    private final long mInstances = 0L;
    private static final java.lang.StackTraceElement[] FAKE_STACK = null;
    public InstanceCountViolation(java.lang.Class p0, long p1, int p2) { super(null); }
    public long getNumberOfInstances() { return 0L; }
}
