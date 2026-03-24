package android.content;

@android.annotation.FlaggedApi("android.content.pm.relative_reference_intent_filters")
public final class UriRelativeFilter {
    static final java.lang.String URI_RELATIVE_FILTER_STR = "uriRelativeFilter";
    public static final int PATH = 0;
    public static final int QUERY = 1;
    public static final int FRAGMENT = 2;
    public UriRelativeFilter(int p0, int p1, java.lang.String p2) {}
    public int getUriPart() { return 0; }
    public int getPatternType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getFilter() { return null; }
    public boolean matchData(android.net.Uri p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public java.lang.String toString() { return null; }
    public android.content.UriRelativeFilterParcel toParcel() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    UriRelativeFilter(android.os.Parcel p0) {}
    public UriRelativeFilter(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public UriRelativeFilter(android.content.UriRelativeFilterParcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UriPart {
    }
}
