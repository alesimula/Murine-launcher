package android.nfc.cardemulation;

public final class AidGroup implements android.os.Parcelable {
    public static final int MAX_NUM_AIDS = 256;
    static final java.lang.String TAG = "AidGroup";
    @android.annotation.UnsupportedAppUsage
    final java.util.List<java.lang.String> aids = null;
    @android.annotation.UnsupportedAppUsage
    final java.lang.String category = null;
    @android.annotation.UnsupportedAppUsage
    final java.lang.String description = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.nfc.cardemulation.AidGroup> CREATOR = null;
    public AidGroup(java.util.List<java.lang.String> p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    AidGroup(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getCategory() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.lang.String> getAids() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static android.nfc.cardemulation.AidGroup createFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public void writeAsXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    static boolean isValidCategory(java.lang.String p0) { return false; }
}
