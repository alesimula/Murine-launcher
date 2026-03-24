package android.telephony.ims;

@android.annotation.SystemApi
public final class RtpHeaderExtension implements android.os.Parcelable {
    private int mLocalIdentifier;
    private byte[] mExtensionData;
    public static final android.os.Parcelable.Creator<android.telephony.ims.RtpHeaderExtension> CREATOR = null;
    public RtpHeaderExtension(int p0, byte[] p1) {}
    private RtpHeaderExtension(android.os.Parcel p0) {}
    public int getLocalIdentifier() { return 0; }
    public byte[] getExtensionData() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
