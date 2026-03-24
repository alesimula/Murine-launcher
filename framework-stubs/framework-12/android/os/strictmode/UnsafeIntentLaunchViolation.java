package android.os.strictmode;

public final class UnsafeIntentLaunchViolation extends android.os.strictmode.Violation {
    private transient android.content.Intent mIntent;
    public UnsafeIntentLaunchViolation(android.content.Intent p0) { super(null); }
    public android.content.Intent getIntent() { return null; }
}
