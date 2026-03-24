package android.view.inputmethod;

public final class InputMethodSubtype implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private static final java.lang.String LANGUAGE_TAG_NONE = "";
    private static final java.lang.String EXTRA_VALUE_PAIR_SEPARATOR = ",";
    private static final java.lang.String EXTRA_VALUE_KEY_VALUE_SEPARATOR = "=";
    private static final java.lang.String EXTRA_KEY_UNTRANSLATABLE_STRING_IN_SUBTYPE_NAME = "UntranslatableReplacementStringInSubtypeName";
    public static final int SUBTYPE_ID_NONE = 0;
    private final boolean mIsAuxiliary = false;
    private final boolean mOverridesImplicitlyEnabledSubtype = false;
    private final boolean mIsAsciiCapable = false;
    private final int mSubtypeHashCode = 0;
    private final int mSubtypeIconResId = 0;
    private final int mSubtypeNameResId = 0;
    private final int mSubtypeId = 0;
    private final java.lang.String mSubtypeLocale = null;
    private final java.lang.String mSubtypeLanguageTag = null;
    private final java.lang.String mSubtypeMode = null;
    private final java.lang.String mSubtypeExtraValue = null;
    private final java.lang.Object mLock = null;
    private volatile java.util.Locale mCachedLocaleObj;
    private volatile java.util.HashMap<java.lang.String, java.lang.String> mExtraValueHashMapCache;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodSubtype> CREATOR = null;
    private static android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder getBuilder(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, int p7, boolean p8) { return null; }
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6) {}
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, int p7) {}
    private InputMethodSubtype(android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder p0) {}
    InputMethodSubtype(android.os.Parcel p0) {}
    public int getNameResId() { return 0; }
    public int getIconResId() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getLocale() { return null; }
    public java.lang.String getLanguageTag() { return null; }
    public java.util.Locale getLocaleObject() { return null; }
    public java.lang.String getMode() { return null; }
    public java.lang.String getExtraValue() { return null; }
    public boolean isAuxiliary() { return false; }
    public boolean overridesImplicitlyEnabledSubtype() { return false; }
    public boolean isAsciiCapable() { return false; }
    public java.lang.CharSequence getDisplayName(android.content.Context p0, java.lang.String p1, android.content.pm.ApplicationInfo p2) { return null; }
    private static java.util.Locale getLocaleFromContext(android.content.Context p0) { return null; }
    private static java.lang.String getLocaleDisplayName(java.util.Locale p0, java.util.Locale p1, android.icu.text.DisplayContext p2) { return null; }
    private java.util.HashMap<java.lang.String, java.lang.String> getExtraValueHashMap() { return null; }
    public boolean containsExtraValueKey(java.lang.String p0) { return false; }
    public java.lang.String getExtraValueOf(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public final boolean hasSubtypeId() { return false; }
    public final int getSubtypeId() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static int hashCodeInternal(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, boolean p5) { return 0; }
    public static java.util.List<android.view.inputmethod.InputMethodSubtype> sort(android.content.Context p0, int p1, android.view.inputmethod.InputMethodInfo p2, java.util.List<android.view.inputmethod.InputMethodSubtype> p3) { return null; }

    public static class InputMethodSubtypeBuilder {
        private boolean mIsAuxiliary;
        private boolean mOverridesImplicitlyEnabledSubtype;
        private boolean mIsAsciiCapable;
        private int mSubtypeIconResId;
        private int mSubtypeNameResId;
        private int mSubtypeId;
        private java.lang.String mSubtypeLocale;
        private java.lang.String mSubtypeLanguageTag;
        private java.lang.String mSubtypeMode;
        private java.lang.String mSubtypeExtraValue;
        public InputMethodSubtypeBuilder() {}
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype build() { return null; }
    }
}
