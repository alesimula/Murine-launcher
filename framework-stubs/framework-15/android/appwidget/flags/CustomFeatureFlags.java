package android.appwidget.flags;

public class CustomFeatureFlags implements android.appwidget.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.appwidget.flags.FeatureFlags>> p0) {}
    public boolean drawDataParcel() { return false; }
    public boolean generatedPreviews() { return false; }
    public boolean remoteAdapterConversion() { return false; }
    public boolean removeAppWidgetServiceIoFromCriticalPath() { return false; }
    public boolean supportResumeRestoreAfterReboot() { return false; }
    public boolean throttleWidgetUpdates() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.appwidget.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
