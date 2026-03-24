package android.hardware.biometrics.fingerprint;

public final class AcquiredInfoAndVendorCode implements android.os.Parcelable {
    public static final int acquiredInfo = 0;
    public static final int vendorCode = 1;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode> CREATOR = null;
    public AcquiredInfoAndVendorCode() {}
    public int getTag() { return 0; }
    public static android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode acquiredInfo(byte p0) { return null; }
    public byte getAcquiredInfo() { return 0; }
    public void setAcquiredInfo(byte p0) {}
    public static android.hardware.biometrics.fingerprint.AcquiredInfoAndVendorCode vendorCode(int p0) { return null; }
    public int getVendorCode() { return 0; }
    public void setVendorCode(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int acquiredInfo = 0;
        public static final int vendorCode = 1;
    }
}
