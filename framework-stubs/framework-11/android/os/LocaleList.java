package android.os;

public final class LocaleList implements android.os.Parcelable {
    private final java.util.Locale[] mList = null;
    private final java.lang.String mStringRepresentation = null;
    private static final java.util.Locale[] sEmptyList = null;
    private static final android.os.LocaleList sEmptyLocaleList = null;
    public static final android.os.Parcelable.Creator<android.os.LocaleList> CREATOR = null;
    private static final java.lang.String STRING_EN_XA = "en-XA";
    private static final java.lang.String STRING_AR_XB = "ar-XB";
    private static final java.util.Locale LOCALE_EN_XA = null;
    private static final java.util.Locale LOCALE_AR_XB = null;
    private static final int NUM_PSEUDO_LOCALES = 2;
    private static final java.util.Locale EN_LATN = null;
    private static final java.lang.Object sLock = null;
    private static android.os.LocaleList sLastExplicitlySetLocaleList;
    private static android.os.LocaleList sDefaultLocaleList;
    private static android.os.LocaleList sDefaultAdjustedLocaleList;
    private static java.util.Locale sLastDefaultLocale;
    public java.util.Locale get(int p0) { return null; }
    public boolean isEmpty() { return false; }
    public int size() { return 0; }
    public int indexOf(java.util.Locale p0) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toLanguageTags() { return null; }
    public LocaleList(java.util.Locale... p0) {}
    public LocaleList(java.util.Locale p0, android.os.LocaleList p1) {}
    public static android.os.LocaleList getEmptyLocaleList() { return null; }
    public static android.os.LocaleList forLanguageTags(java.lang.String p0) { return null; }
    private static java.lang.String getLikelyScript(java.util.Locale p0) { return null; }
    private static boolean isPseudoLocale(java.lang.String p0) { return false; }
    public static boolean isPseudoLocale(java.util.Locale p0) { return false; }
    public static boolean isPseudoLocale(android.icu.util.ULocale p0) { return false; }
    private static int matchScore(java.util.Locale p0, java.util.Locale p1) { return 0; }
    private int findFirstMatchIndex(java.util.Locale p0) { return 0; }
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> p0, boolean p1) { return 0; }
    private java.util.Locale computeFirstMatch(java.util.Collection<java.lang.String> p0, boolean p1) { return null; }
    public java.util.Locale getFirstMatch(java.lang.String[] p0) { return null; }
    public int getFirstMatchIndex(java.lang.String[] p0) { return 0; }
    public java.util.Locale getFirstMatchWithEnglishSupported(java.lang.String[] p0) { return null; }
    public int getFirstMatchIndexWithEnglishSupported(java.util.Collection<java.lang.String> p0) { return 0; }
    public int getFirstMatchIndexWithEnglishSupported(java.lang.String[] p0) { return 0; }
    public static boolean isPseudoLocalesOnly(java.lang.String[] p0) { return false; }
    public static android.os.LocaleList getDefault() { return null; }
    public static android.os.LocaleList getAdjustedDefault() { return null; }
    public static void setDefault(android.os.LocaleList p0) {}
    public static void setDefault(android.os.LocaleList p0, int p1) {}
}
