package android.hardware.radio.network;

public class EutranRegistrationInfo implements android.os.Parcelable {
    public android.hardware.radio.network.LteVopsInfo lteVopsInfo;
    public android.hardware.radio.network.NrIndicators nrIndicators;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.EutranRegistrationInfo> CREATOR = null;
    public EutranRegistrationInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
