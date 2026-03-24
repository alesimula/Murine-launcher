package android.view.inputmethod;

public final class InputMethodInfo implements android.os.Parcelable {
    static final java.lang.String TAG = "InputMethodInfo";
    final android.content.pm.ResolveInfo mService = null;
    final boolean mIsVrOnly = false;
    final java.lang.String mId = null;
    final java.lang.String mSettingsActivityName = null;
    final int mIsDefaultResId = 0;
    private final android.view.inputmethod.InputMethodSubtypeArray mSubtypes = null;
    private final boolean mIsAuxIme = false;
    private final boolean mForceDefault = false;
    private final boolean mSupportsSwitchingToNextInputMethod = false;
    private final boolean mInlineSuggestionsEnabled = false;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodInfo> CREATOR = null;
    public static java.lang.String computeId(android.content.pm.ResolveInfo p0) { return null; }
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, java.util.List<android.view.inputmethod.InputMethodSubtype> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    InputMethodInfo(android.os.Parcel p0) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5, boolean p6, boolean p7) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5, boolean p6, boolean p7, boolean p8) {}
    private static android.content.pm.ResolveInfo buildDummyResolveInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2) { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getServiceName() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public boolean isVrOnly() { return false; }
    public int getSubtypeCount() { return 0; }
    public android.view.inputmethod.InputMethodSubtype getSubtypeAt(int p0) { return null; }
    public int getIsDefaultResourceId() { return 0; }
    public boolean isDefault(android.content.Context p0) { return false; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSystem() { return false; }
    public boolean isAuxiliaryIme() { return false; }
    public boolean supportsSwitchingToNextInputMethod() { return false; }
    public boolean isInlineSuggestionsEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
