package android.location;

public class GeocoderParams implements android.os.Parcelable {
    private final int mUid = 0;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mAttributionTag = null;
    private final java.util.Locale mLocale = null;
    public static final android.os.Parcelable.Creator<android.location.GeocoderParams> CREATOR = null;
    public GeocoderParams(android.content.Context p0) {}
    public GeocoderParams(android.content.Context p0, java.util.Locale p1) {}
    private GeocoderParams(int p0, java.lang.String p1, java.lang.String p2, java.util.Locale p3) {}
    public int getClientUid() { return 0; }
    public java.lang.String getClientPackage() { return null; }
    public java.lang.String getClientAttributionTag() { return null; }
    public java.util.Locale getLocale() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
