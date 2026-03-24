package android.content.pm.parsing.component;

public class ParsedActivity extends android.content.pm.parsing.component.ParsedMainComponent {
    int theme;
    int uiOptions;
    private java.lang.String targetActivity;
    private java.lang.String parentActivityName;
    java.lang.String taskAffinity;
    int privateFlags;
    private java.lang.String permission;
    int launchMode;
    int documentLaunchMode;
    int maxRecents;
    int configChanges;
    int softInputMode;
    int persistableMode;
    int lockTaskLaunchMode;
    int screenOrientation;
    int resizeMode;
    private java.lang.Float maxAspectRatio;
    private java.lang.Float minAspectRatio;
    private boolean supportsSizeChanges;
    java.lang.String requestedVrComponent;
    int rotationAnimation;
    int colorMode;
    android.content.pm.ActivityInfo.WindowLayout windowLayout;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedActivity> CREATOR = null;
    public ParsedActivity(android.content.pm.parsing.component.ParsedActivity p0) { super(); }
    public static android.content.pm.parsing.component.ParsedActivity makeAppDetailsActivity(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, boolean p4) { return null; }
    static android.content.pm.parsing.component.ParsedActivity makeAlias(java.lang.String p0, android.content.pm.parsing.component.ParsedActivity p1) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setMaxAspectRatio(int p0, float p1) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setMinAspectRatio(int p0, float p1) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setSupportsSizeChanges(boolean p0) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setFlags(int p0) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setResizeMode(int p0) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setTargetActivity(java.lang.String p0) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setParentActivity(java.lang.String p0) { return null; }
    public android.content.pm.parsing.component.ParsedActivity setPermission(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public ParsedActivity() { super(); }
    protected ParsedActivity(android.os.Parcel p0) { super(); }
    public int getTheme() { return 0; }
    public int getUiOptions() { return 0; }
    public java.lang.String getTargetActivity() { return null; }
    public java.lang.String getParentActivityName() { return null; }
    public java.lang.String getTaskAffinity() { return null; }
    public int getPrivateFlags() { return 0; }
    public java.lang.String getPermission() { return null; }
    public int getLaunchMode() { return 0; }
    public int getDocumentLaunchMode() { return 0; }
    public int getMaxRecents() { return 0; }
    public int getConfigChanges() { return 0; }
    public int getSoftInputMode() { return 0; }
    public int getPersistableMode() { return 0; }
    public int getLockTaskLaunchMode() { return 0; }
    public int getScreenOrientation() { return 0; }
    public int getResizeMode() { return 0; }
    public java.lang.Float getMaxAspectRatio() { return null; }
    public java.lang.Float getMinAspectRatio() { return null; }
    public boolean getSupportsSizeChanges() { return false; }
    public java.lang.String getRequestedVrComponent() { return null; }
    public int getRotationAnimation() { return 0; }
    public int getColorMode() { return 0; }
    public android.content.pm.ActivityInfo.WindowLayout getWindowLayout() { return null; }
}
