package android.app;

@android.annotation.SuppressLint("UserHandleName")
public class ComponentOptions {
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED = "android.pendingIntent.backgroundActivityAllowed";
    public static final java.lang.String KEY_PENDING_INTENT_BACKGROUND_ACTIVITY_ALLOWED_BY_PERMISSION = "android.pendingIntent.backgroundActivityAllowedByPermission";
    ComponentOptions() {}
    ComponentOptions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    @android.annotation.NonNull
    public android.app.ComponentOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    public void setPendingIntentBackgroundActivityLaunchAllowedByPermission(boolean p0) {}
    public boolean isPendingIntentBackgroundActivityLaunchAllowedByPermission() { return false; }
    public android.os.Bundle toBundle() { return null; }
    @android.annotation.Nullable
    public static android.app.ComponentOptions fromBundle(android.os.Bundle p0) { return null; }
}
