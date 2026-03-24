package android.appwidget.flags;

public interface FeatureFlags {
    public boolean drawDataParcel();
    public boolean generatedPreviews();
    public boolean remoteAdapterConversion();
    public boolean removeAppWidgetServiceIoFromCriticalPath();
    public boolean supportResumeRestoreAfterReboot();
    public boolean throttleWidgetUpdates();
}
