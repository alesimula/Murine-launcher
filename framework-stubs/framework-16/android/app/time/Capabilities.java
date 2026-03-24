package android.app.time;

@android.annotation.SystemApi
public final class Capabilities {
    public static final int CAPABILITY_NOT_SUPPORTED = 10;
    public static final int CAPABILITY_NOT_ALLOWED = 20;
    public static final int CAPABILITY_NOT_APPLICABLE = 30;
    public static final int CAPABILITY_POSSESSED = 40;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CapabilityState {
    }
}
