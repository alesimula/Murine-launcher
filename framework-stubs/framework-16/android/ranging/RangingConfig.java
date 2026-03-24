package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public abstract class RangingConfig implements android.os.Parcelable {
    public static final int RANGING_SESSION_OOB = 1;
    public static final int RANGING_SESSION_RAW = 0;
    protected RangingConfig() {}
    public int getRangingSessionType() { return 0; }
}
