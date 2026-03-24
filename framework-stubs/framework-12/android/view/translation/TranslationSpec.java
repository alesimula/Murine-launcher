package android.view.translation;

public final class TranslationSpec implements android.os.Parcelable {
    public static final int DATA_FORMAT_TEXT = 1;
    @java.lang.Deprecated
    private final java.lang.String mLanguage = null;
    private final int mDataFormat = 0;
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationSpec> CREATOR = null;
    void parcelLocale(android.os.Parcel p0, int p1) {}
    static android.icu.util.ULocale unparcelLocale(android.os.Parcel p0) { return null; }
    @java.lang.Deprecated
    public TranslationSpec(java.lang.String p0, int p1) {}
    public TranslationSpec(android.icu.util.ULocale p0, int p1) {}
    @java.lang.Deprecated
    public java.lang.String getLanguage() { return null; }
    public android.icu.util.ULocale getLocale() { return null; }
    public int getDataFormat() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TranslationSpec(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataFormat {
    }
}
