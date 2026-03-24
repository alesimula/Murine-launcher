package android.nfc;

public final class NfcAntennaInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nfc.NfcAntennaInfo> CREATOR = null;
    public NfcAntennaInfo(int p0, int p1, boolean p2, java.util.List<android.nfc.AvailableNfcAntenna> p3) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.nfc.AvailableNfcAntenna> getAvailableNfcAntennas() { return null; }
    public int getDeviceHeight() { return 0; }
    public int getDeviceWidth() { return 0; }
    public boolean isDeviceFoldable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
