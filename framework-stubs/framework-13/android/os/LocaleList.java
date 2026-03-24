package android.os;

public final class LocaleList implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.LocaleList> CREATOR = null;
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
    public static boolean isPseudoLocale(java.util.Locale p0) { return false; }
    public static boolean isPseudoLocale(android.icu.util.ULocale p0) { return false; }
    public static boolean matchesLanguageAndScript(java.util.Locale p0, java.util.Locale p1) { return false; }
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
