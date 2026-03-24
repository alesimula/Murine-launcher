package android.app;

@android.annotation.SuppressLint("UserHandleName")
public class ComponentOptions {
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED = "android.pendingIntent.backgroundActivityAllowed";
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED_BY_PERMISSION = "android.pendingIntent.backgroundActivityAllowedByPermission";
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = 0;
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = 1;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = 2;
    ComponentOptions() {}
    ComponentOptions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public android.app.ComponentOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    public void setPendingIntentBackgroundActivityLaunchAllowedByPermission(boolean p0) {}
    public boolean isPendingIntentBackgroundActivityLaunchAllowedByPermission() { return false; }
    public android.os.Bundle toBundle() { return null; }
    public static android.app.ComponentOptions fromBundle(android.os.Bundle p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackgroundActivityStartMode {
    }
}
