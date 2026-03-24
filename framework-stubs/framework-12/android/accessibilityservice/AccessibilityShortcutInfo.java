package android.accessibilityservice;

public final class AccessibilityShortcutInfo {
    private static final java.lang.String TAG_ACCESSIBILITY_SHORTCUT = "accessibility-shortcut-target";
    public static final java.lang.String META_DATA = "android.accessibilityshortcut.target";
    private final android.content.ComponentName mComponentName = null;
    private final android.content.pm.ActivityInfo mActivityInfo = null;
    private final int mSummaryResId = 0;
    private final int mDescriptionResId = 0;
    private final int mAnimatedImageRes = 0;
    private final int mHtmlDescriptionRes = 0;
    private java.lang.String mSettingsActivityName;
    public AccessibilityShortcutInfo(android.content.Context p0, android.content.pm.ActivityInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.content.pm.ActivityInfo getActivityInfo() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String loadSummary(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String loadDescription(android.content.pm.PackageManager p0) { return null; }
    public int getAnimatedImageRes() { return 0; }
    public android.graphics.drawable.Drawable loadAnimatedImage(android.content.Context p0) { return null; }
    public java.lang.String loadHtmlDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    private java.lang.String loadResourceString(android.content.pm.PackageManager p0, android.content.pm.ActivityInfo p1, int p2) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
