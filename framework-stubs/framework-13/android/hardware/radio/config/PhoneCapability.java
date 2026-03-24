package android.hardware.radio.config;

public class PhoneCapability implements android.os.Parcelable {
    public byte maxActiveData;
    public byte maxActiveInternetData;
    public boolean isInternetLingeringSupported;
    public byte[] logicalModemIds;
    public static final android.os.Parcelable.Creator<android.hardware.radio.config.PhoneCapability> CREATOR = null;
    public PhoneCapability() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
