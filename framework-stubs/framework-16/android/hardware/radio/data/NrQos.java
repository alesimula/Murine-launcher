package android.hardware.radio.data;

public class NrQos implements android.os.Parcelable {
    public int fiveQi;
    public android.hardware.radio.data.QosBandwidth downlink;
    public android.hardware.radio.data.QosBandwidth uplink;
    public byte qfi;
    @java.lang.Deprecated
    public char averagingWindowMs;
    public int averagingWindowMillis;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.NrQos> CREATOR = null;
    public static final byte FLOW_ID_RANGE_MIN = 1;
    public static final byte FLOW_ID_RANGE_MAX = 63;
    public static final int AVERAGING_WINDOW_UNKNOWN = -1;
    public NrQos() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
