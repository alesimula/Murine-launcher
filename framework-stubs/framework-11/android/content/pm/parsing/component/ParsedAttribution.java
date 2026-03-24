package android.content.pm.parsing.component;

public class ParsedAttribution implements android.os.Parcelable {
    public static final int MAX_ATTRIBUTION_TAG_LEN = 50;
    private static final int MAX_NUM_ATTRIBUTIONS = 1000;
    public final java.lang.String tag = null;
    public final int label = 0;
    public final java.util.List<java.lang.String> inheritFrom = null;
    public static final android.os.Parcelable.Creator<android.content.pm.parsing.component.ParsedAttribution> CREATOR = null;
    public static boolean isCombinationValid(java.util.List<android.content.pm.parsing.component.ParsedAttribution> p0) { return false; }
    public static java.lang.String maxToString(int p0) { return null; }
    public ParsedAttribution(java.lang.String p0, int p1, java.util.List<java.lang.String> p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedAttribution(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Max {
    }
}
