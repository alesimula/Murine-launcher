package android.hardware.radio.network;

public class EmergencyRegResult implements android.os.Parcelable {
    public int accessNetwork;
    public int regState;
    public int emcDomain;
    public boolean isVopsSupported;
    public boolean isEmcBearerSupported;
    public byte nwProvidedEmc;
    public byte nwProvidedEmf;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.EmergencyRegResult> CREATOR = null;
    public EmergencyRegResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
