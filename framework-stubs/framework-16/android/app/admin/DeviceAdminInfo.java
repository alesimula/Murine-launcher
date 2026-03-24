package android.app.admin;

public final class DeviceAdminInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "DeviceAdminInfo";
    public static final int USES_POLICY_LIMIT_PASSWORD = 0;
    public static final int USES_POLICY_WATCH_LOGIN = 1;
    public static final int USES_POLICY_RESET_PASSWORD = 2;
    public static final int USES_POLICY_FORCE_LOCK = 3;
    public static final int USES_POLICY_WIPE_DATA = 4;
    public static final int USES_POLICY_SETS_GLOBAL_PROXY = 5;
    public static final int USES_POLICY_EXPIRE_PASSWORD = 6;
    public static final int USES_ENCRYPTED_STORAGE = 7;
    public static final int USES_POLICY_DISABLE_CAMERA = 8;
    public static final int USES_POLICY_DISABLE_KEYGUARD_FEATURES = 9;
    public static final int HEADLESS_DEVICE_OWNER_MODE_UNSUPPORTED = 0;
    public static final int HEADLESS_DEVICE_OWNER_MODE_AFFILIATED = 1;
    public static final int HEADLESS_DEVICE_OWNER_MODE_SINGLE_USER = 2;
    static java.util.ArrayList<android.app.admin.DeviceAdminInfo.PolicyInfo> sPoliciesDisplayOrder;
    static java.util.HashMap<java.lang.String, java.lang.Integer> sKnownPolicies;
    static android.util.SparseArray<android.app.admin.DeviceAdminInfo.PolicyInfo> sRevKnownPolicies;
    final android.content.pm.ActivityInfo mActivityInfo = null;
    boolean mVisible;
    int mUsesPolicies;
    boolean mSupportsTransferOwnership;
    int mHeadlessDeviceOwnerMode;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.DeviceAdminInfo> CREATOR = null;
    public DeviceAdminInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public DeviceAdminInfo(android.content.Context p0, android.content.pm.ActivityInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    DeviceAdminInfo(android.os.Parcel p0) {}
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getReceiverName() { return null; }
    public android.content.pm.ActivityInfo getActivityInfo() { return null; }
    @android.annotation.NonNull
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) throws android.content.res.Resources.NotFoundException { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public boolean isVisible() { return false; }
    public boolean usesPolicy(int p0) { return false; }
    public java.lang.String getTagForPolicy(int p0) { return null; }
    public boolean supportsTransferOwnership() { return false; }
    public int getHeadlessDeviceOwnerMode() { return 0; }
    public java.util.ArrayList<android.app.admin.DeviceAdminInfo.PolicyInfo> getUsedPolicies() { return null; }
    public void writePoliciesToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.io.IOException {}
    public void readPoliciesFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadlessDeviceOwnerMode {
    }

    public static class PolicyInfo {
        public final int ident = 0;
        public final java.lang.String tag = null;
        public final int label = 0;
        public final int description = 0;
        public final int labelForSecondaryUsers = 0;
        public final int descriptionForSecondaryUsers = 0;
        public PolicyInfo(int p0, java.lang.String p1, int p2, int p3) {}
        public PolicyInfo(int p0, java.lang.String p1, int p2, int p3, int p4, int p5) {}
    }
}
