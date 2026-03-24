package android.accessibilityservice;

public class AccessibilityServiceInfo implements android.os.Parcelable {
    private static final java.lang.String TAG_ACCESSIBILITY_SERVICE = "accessibility-service";
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = 16;
    public static final int CAPABILITY_CAN_PERFORM_GESTURES = 32;
    public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = 64;
    private static android.util.SparseArray<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> sAvailableCapabilityInfos;
    public static final int FEEDBACK_SPOKEN = 1;
    public static final int FEEDBACK_HAPTIC = 2;
    public static final int FEEDBACK_AUDIBLE = 4;
    public static final int FEEDBACK_VISUAL = 8;
    public static final int FEEDBACK_GENERIC = 16;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int DEFAULT = 1;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = 64;
    public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = 128;
    public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = 256;
    public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = 512;
    public static final int FLAG_REQUEST_SHORTCUT_WARNING_DIALOG_SPOKEN_FEEDBACK = 1024;
    public static final int FLAG_FORCE_DIRECT_BOOT_AWARE = 65536;
    public int eventTypes;
    public java.lang.String[] packageNames;
    public int feedbackType;
    public long notificationTimeout;
    public int flags;
    public boolean crashed;
    private int mNonInteractiveUiTimeout;
    private int mInteractiveUiTimeout;
    private android.content.ComponentName mComponentName;
    private android.content.pm.ResolveInfo mResolveInfo;
    private java.lang.String mSettingsActivityName;
    private int mCapabilities;
    private int mSummaryResId;
    private java.lang.String mNonLocalizedSummary;
    private int mDescriptionResId;
    private java.lang.String mNonLocalizedDescription;
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityServiceInfo> CREATOR = null;
    public AccessibilityServiceInfo() {}
    public AccessibilityServiceInfo(android.content.pm.ResolveInfo p0, android.content.Context p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void updateDynamicallyConfigurableProperties(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    public void setComponentName(android.content.ComponentName p0) {}
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getId() { return null; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.String getSettingsActivityName() { return null; }
    public boolean getCanRetrieveWindowContent() { return false; }
    public int getCapabilities() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setCapabilities(int p0) {}
    public java.lang.CharSequence loadSummary(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String loadDescription(android.content.pm.PackageManager p0) { return null; }
    public void setNonInteractiveUiTimeoutMillis(int p0) {}
    public int getNonInteractiveUiTimeoutMillis() { return 0; }
    public void setInteractiveUiTimeoutMillis(int p0) {}
    public int getInteractiveUiTimeoutMillis() { return 0; }
    public boolean isDirectBootAware() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void initFromParcel(android.os.Parcel p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private static void appendFeedbackTypes(java.lang.StringBuilder p0, int p1) {}
    private static void appendPackageNames(java.lang.StringBuilder p0, java.lang.String[] p1) {}
    private static void appendEventTypes(java.lang.StringBuilder p0, int p1) {}
    private static void appendFlags(java.lang.StringBuilder p0, int p1) {}
    private static void appendCapabilities(java.lang.StringBuilder p0, int p1) {}
    public static java.lang.String feedbackTypeToString(int p0) { return null; }
    public static java.lang.String flagToString(int p0) { return null; }
    public static java.lang.String capabilityToString(int p0) { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfos() { return null; }
    public java.util.List<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfos(android.content.Context p0) { return null; }
    private static android.util.SparseArray<android.accessibilityservice.AccessibilityServiceInfo.CapabilityInfo> getCapabilityInfoSparseArray(android.content.Context p0) { return null; }
    private static boolean fingerprintAvailable(android.content.Context p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FeedbackType {
    }

    public static final class CapabilityInfo {
        public final int capability = 0;
        public final int titleResId = 0;
        public final int descResId = 0;
        public CapabilityInfo(int p0, int p1, int p2) {}
    }
}
