package android.content.pm;

public class FeatureInfo implements android.os.Parcelable {
    public java.lang.String name;
    public int version;
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    public int reqGlEsVersion;
    public static final int FLAG_REQUIRED = 1;
    public int flags;
    public static final android.os.Parcelable.Creator<android.content.pm.FeatureInfo> CREATOR = null;
    public FeatureInfo() {}
    public FeatureInfo(android.content.pm.FeatureInfo p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String getGlEsVersion() { return null; }
}
