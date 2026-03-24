package android.hardware.radio.network;

public class CellInfoLte implements android.os.Parcelable {
    public android.hardware.radio.network.CellIdentityLte cellIdentityLte;
    public android.hardware.radio.network.LteSignalStrength signalStrengthLte;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellInfoLte> CREATOR = null;
    public CellInfoLte() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
