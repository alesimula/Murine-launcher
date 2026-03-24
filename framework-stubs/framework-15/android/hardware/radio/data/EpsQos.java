package android.hardware.radio.data;

public class EpsQos implements android.os.Parcelable {
    public int qci;
    public android.hardware.radio.data.QosBandwidth downlink;
    public android.hardware.radio.data.QosBandwidth uplink;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.EpsQos> CREATOR = null;
    public EpsQos() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
