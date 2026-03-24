package android.service.voice;

@android.annotation.SystemApi
public final class FailureSuggestedAction {
    public static final int UNKNOWN = 0;
    public static final int NONE = 1;
    public static final int DISABLE_DETECTION = 2;
    public static final int RECREATE_DETECTOR = 3;
    public static final int RESTART_RECOGNITION = 4;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureSuggestedActionDef {
    }
}
