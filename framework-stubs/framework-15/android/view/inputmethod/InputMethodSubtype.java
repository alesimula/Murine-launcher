package android.view.inputmethod;

public final class InputMethodSubtype implements android.os.Parcelable {
    public static final int SUBTYPE_ID_NONE = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputMethodSubtype> CREATOR = null;
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6) {}
    @java.lang.Deprecated
    public InputMethodSubtype(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, boolean p6, int p7) {}
    InputMethodSubtype(android.os.Parcel p0) {}
    public int getNameResId() { return 0; }
    @android.annotation.NonNull
    public java.lang.CharSequence getNameOverride() { return null; }
    @android.annotation.Nullable
    public android.icu.util.ULocale getPhysicalKeyboardHintLanguageTag() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPhysicalKeyboardHintLayoutType() { return null; }
    public int getIconResId() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getLocale() { return null; }
    @android.annotation.NonNull
    public java.lang.String getLanguageTag() { return null; }
    @android.annotation.Nullable
    public java.util.Locale getLocaleObject() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCanonicalizedLanguageTag() { return null; }
    public boolean isSuitableForPhysicalKeyboardLayoutMapping() { return false; }
    public java.lang.String getMode() { return null; }
    public java.lang.String getExtraValue() { return null; }
    public boolean isAuxiliary() { return false; }
    public boolean overridesImplicitlyEnabledSubtype() { return false; }
    public boolean isAsciiCapable() { return false; }
    @android.annotation.NonNull
    public java.lang.CharSequence getDisplayName(android.content.Context p0, java.lang.String p1, android.content.pm.ApplicationInfo p2) { return null; }
    public boolean containsExtraValueKey(java.lang.String p0) { return false; }
    public java.lang.String getExtraValueOf(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public final boolean hasSubtypeId() { return false; }
    public final int getSubtypeId() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    void dump(android.util.Printer p0, java.lang.String p1) {}
    public static java.util.List<android.view.inputmethod.InputMethodSubtype> sort(android.view.inputmethod.InputMethodInfo p0, java.util.List<android.view.inputmethod.InputMethodSubtype> p1) { return null; }

    public static class InputMethodSubtypeBuilder {
        public InputMethodSubtypeBuilder() {}
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAuxiliary(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setOverridesImplicitlyEnabledSubtype(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setIsAsciiCapable(boolean p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeIconResId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeNameOverride(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setPhysicalKeyboardHint(android.icu.util.ULocale p0, java.lang.String p1) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeId(int p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeLocale(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setLanguageTag(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeMode(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype.InputMethodSubtypeBuilder setSubtypeExtraValue(java.lang.String p0) { return null; }
        public android.view.inputmethod.InputMethodSubtype build() { return null; }
    }
}
