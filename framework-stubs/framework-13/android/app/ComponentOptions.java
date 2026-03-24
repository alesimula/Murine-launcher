package android.app;

public class ComponentOptions {
    public static final boolean PENDING_INTENT_BAL_ALLOWED_DEFAULT = true;
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED = "android.pendingIntent.backgroundActivityAllowed";
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED_BY_PERMISSION = "android.pendingIntent.backgroundActivityAllowedByPermission";
    ComponentOptions() {}
    ComponentOptions(android.os.Bundle p0) {}
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public void setPendingIntentBackgroundActivityLaunchAllowedByPermission(boolean p0) {}
    public boolean isPendingIntentBackgroundActivityLaunchAllowedByPermission() { return false; }
    public android.os.Bundle toBundle() { return null; }
}
