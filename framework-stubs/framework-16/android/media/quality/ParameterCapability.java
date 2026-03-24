package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class ParameterCapability implements android.os.Parcelable {
    public static final int TYPE_NONE = 0;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_DOUBLE = 3;
    public static final int TYPE_STRING = 4;
    public static final java.lang.String CAPABILITY_MAX = "max";
    public static final java.lang.String CAPABILITY_MIN = "min";
    public static final java.lang.String CAPABILITY_DEFAULT = "default";
    public static final java.lang.String CAPABILITY_ENUM = "enum";
    public static final android.os.Parcelable.Creator<android.media.quality.ParameterCapability> CREATOR = null;
    protected ParameterCapability(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public ParameterCapability(java.lang.String p0, boolean p1, int p2, android.os.Bundle p3) {}
    public java.lang.String getParameterName() { return null; }
    public boolean isSupported() { return false; }
    public int getParameterType() { return 0; }
    public android.os.Bundle getCapabilities() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Capability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParameterType {
    }
}
