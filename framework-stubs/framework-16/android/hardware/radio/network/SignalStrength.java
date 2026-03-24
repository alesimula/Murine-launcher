package android.hardware.radio.network;

public class SignalStrength implements android.os.Parcelable {
    public android.hardware.radio.network.GsmSignalStrength gsm;
    @java.lang.Deprecated
    public android.hardware.radio.network.CdmaSignalStrength cdma;
    @java.lang.Deprecated
    public android.hardware.radio.network.EvdoSignalStrength evdo;
    public android.hardware.radio.network.LteSignalStrength lte;
    public android.hardware.radio.network.TdscdmaSignalStrength tdscdma;
    public android.hardware.radio.network.WcdmaSignalStrength wcdma;
    public android.hardware.radio.network.NrSignalStrength nr;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.SignalStrength> CREATOR = null;
    public SignalStrength() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
