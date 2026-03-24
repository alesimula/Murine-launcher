package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppBinary implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppBinary> CREATOR = null;
    public NanoAppBinary(byte[] p0) {}
    public byte[] getBinary() { return null; }
    public byte[] getBinaryNoHeader() { return null; }
    public boolean hasValidHeader() { return false; }
    public int getHeaderVersion() { return 0; }
    public long getNanoAppId() { return 0L; }
    public int getNanoAppVersion() { return 0; }
    public long getHwHubType() { return 0L; }
    public byte getTargetChreApiMajorVersion() { return 0; }
    public byte getTargetChreApiMinorVersion() { return 0; }
    public int getFlags() { return 0; }
    public boolean isSigned() { return false; }
    public boolean isEncrypted() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
