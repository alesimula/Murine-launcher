package android.hardware.contexthub;

public class ContextHubInfo implements android.os.Parcelable {
    public java.lang.String name;
    public java.lang.String vendor;
    public java.lang.String toolchain;
    public int id;
    public float peakMips;
    public int maxSupportedMessageLengthBytes;
    public long chrePlatformId;
    public byte chreApiMajorVersion;
    public byte chreApiMinorVersion;
    public char chrePatchVersion;
    public java.lang.String[] supportedPermissions;
    public boolean supportsReliableMessages;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.ContextHubInfo> CREATOR = null;
    public ContextHubInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
