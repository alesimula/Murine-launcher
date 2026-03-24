package android.view.textservice;

public final class SpellCheckerSubtype implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private static final java.lang.String EXTRA_VALUE_PAIR_SEPARATOR = ",";
    private static final java.lang.String EXTRA_VALUE_KEY_VALUE_SEPARATOR = "=";
    public static final int SUBTYPE_ID_NONE = 0;
    private static final java.lang.String SUBTYPE_LANGUAGE_TAG_NONE = "";
    private final int mSubtypeId = 0;
    private final int mSubtypeHashCode = 0;
    private final int mSubtypeNameResId = 0;
    private final java.lang.String mSubtypeLocale = null;
    private final java.lang.String mSubtypeLanguageTag = null;
    private final java.lang.String mSubtypeExtraValue = null;
    private java.util.HashMap<java.lang.String, java.lang.String> mExtraValueHashMapCache;
    public static final android.os.Parcelable.Creator<android.view.textservice.SpellCheckerSubtype> CREATOR = null;
    public SpellCheckerSubtype(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) {}
    @java.lang.Deprecated
    public SpellCheckerSubtype(int p0, java.lang.String p1, java.lang.String p2) {}
    SpellCheckerSubtype(android.os.Parcel p0) {}
    public int getNameResId() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getLocale() { return null; }
    public java.lang.String getLanguageTag() { return null; }
    public java.lang.String getExtraValue() { return null; }
    private java.util.HashMap<java.lang.String, java.lang.String> getExtraValueHashMap() { return null; }
    public boolean containsExtraValueKey(java.lang.String p0) { return false; }
    public java.lang.String getExtraValueOf(java.lang.String p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Locale getLocaleObject() { return null; }
    public java.lang.CharSequence getDisplayName(android.content.Context p0, java.lang.String p1, android.content.pm.ApplicationInfo p2) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static int hashCodeInternal(java.lang.String p0, java.lang.String p1) { return 0; }
    public static java.util.List<android.view.textservice.SpellCheckerSubtype> sort(android.content.Context p0, int p1, android.view.textservice.SpellCheckerInfo p2, java.util.List<android.view.textservice.SpellCheckerSubtype> p3) { return null; }
}
