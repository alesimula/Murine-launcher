package android.media;

public class AudioDescriptor implements android.os.Parcelable {
    public static final int STANDARD_NONE = 0;
    public static final int STANDARD_EDID = 1;
    public static final int STANDARD_SADB = 2;
    public static final int STANDARD_VSADB = 3;
    public static final android.os.Parcelable.Creator<android.media.AudioDescriptor> CREATOR = null;
    @android.annotation.SystemApi
    public AudioDescriptor(int p0, int p1, byte[] p2) {}
    public int getStandard() { return 0; }
    public byte[] getDescriptor() { return null; }
    public int getEncapsulationType() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDescriptorStandard {
    }
}
