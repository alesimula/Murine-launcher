package android.appwidget.flags;

public final class FeatureFlagsImpl implements android.appwidget.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean drawDataParcel() { return false; }
    public boolean generatedPreviews() { return false; }
    public boolean remoteAdapterConversion() { return false; }
    public boolean removeAppWidgetServiceIoFromCriticalPath() { return false; }
    public boolean supportResumeRestoreAfterReboot() { return false; }
    public boolean throttleWidgetUpdates() { return false; }
}
