package android.view.inputmethod;

public final class InputMethodInfo implements android.os.Parcelable {
    public static final java.lang.String ACTION_STYLUS_HANDWRITING_SETTINGS = "android.view.inputmethod.action.STYLUS_HANDWRITING_SETTINGS";
    @android.annotation.FlaggedApi("android.view.inputmethod.ime_switcher_revamp_api")
    public static final java.lang.String ACTION_IME_LANGUAGE_SETTINGS = "android.view.inputmethod.action.IME_LANGUAGE_SETTINGS";
    public static final int COMPONENT_NAME_MAX_LENGTH = 1000;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final int MAX_IMES_PER_PACKAGE = 20;
    static final java.lang.String TAG = "InputMethodInfo";
    final android.content.pm.ResolveInfo mService = null;
    final boolean mIsVrOnly = false;
    final boolean mIsVirtualDeviceOnly = false;
    final java.lang.String mId = null;
    final java.lang.String mSettingsActivityName = null;
    final int mIsDefaultResId = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodInfo> CREATOR = null;
    public static java.lang.String computeId(android.content.pm.ResolveInfo p0) { return null; }
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public InputMethodInfo(android.content.Context p0, android.content.pm.ResolveInfo p1, java.util.List<android.view.inputmethod.InputMethodSubtype> p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public InputMethodInfo(android.view.inputmethod.InputMethodInfo p0) {}
    public InputMethodInfo(android.view.inputmethod.InputMethodInfo p0, java.util.List<android.view.inputmethod.InputMethodSubtype> p1) {}
    InputMethodInfo(android.os.Parcel p0) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, boolean p4, java.lang.String p5) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, java.lang.String p4, boolean p5, java.lang.String p6) {}
    @android.annotation.FlaggedApi("android.view.inputmethod.connectionless_handwriting")
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, java.lang.String p7) {}
    public InputMethodInfo(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.String p3, int p4) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3, int p4, boolean p5, boolean p6, boolean p7) {}
    public InputMethodInfo(android.content.pm.ResolveInfo p0, boolean p1, java.lang.String p2, java.lang.String p3, java.util.List<android.view.inputmethod.InputMethodSubtype> p4, int p5, boolean p6, boolean p7, boolean p8, boolean p9, boolean p10, int p11, boolean p12, boolean p13, java.lang.String p14, boolean p15) {}
    public java.lang.String getId() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getServiceName() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String getSettingsActivity() { return null; }
    public boolean isVrOnly() { return false; }
    @android.annotation.SystemApi
    public boolean isVirtualDeviceOnly() { return false; }
    public int getSubtypeCount() { return 0; }
    public android.view.inputmethod.InputMethodSubtype getSubtypeAt(int p0) { return null; }
    public int getIsDefaultResourceId() { return 0; }
    public boolean isDefault(android.content.Context p0) { return false; }
    public int getConfigChanges() { return 0; }
    public boolean supportsStylusHandwriting() { return false; }
    @android.annotation.FlaggedApi("android.view.inputmethod.connectionless_handwriting")
    public boolean supportsConnectionlessStylusHandwriting() { return false; }
    @android.annotation.Nullable
    public android.content.Intent createStylusHandwritingSettingsActivityIntent() { return null; }
    @android.annotation.FlaggedApi("android.view.inputmethod.ime_switcher_revamp_api")
    @android.annotation.Nullable
    public android.content.Intent createImeLanguageSettingsActivityIntent() { return null; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSystem() { return false; }
    public boolean isAuxiliaryIme() { return false; }
    public boolean supportsSwitchingToNextInputMethod() { return false; }
    public boolean isInlineSuggestionsEnabled() { return false; }
    public boolean supportsInlineSuggestionsWithTouchExploration() { return false; }
    public boolean suppressesSpellChecker() { return false; }
    public boolean shouldShowInInputMethodPicker() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
