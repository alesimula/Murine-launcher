package android.telephony.data;

public final class NrQos extends android.telephony.data.Qos implements android.os.Parcelable {
    int qosFlowId;
    int fiveQi;
    int averagingWindowMs;
    public static final android.os.Parcelable.Creator<android.telephony.data.NrQos> CREATOR = null;
    public NrQos(android.telephony.data.Qos.QosBandwidth p0, android.telephony.data.Qos.QosBandwidth p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
    public static android.telephony.data.NrQos createFromParcelBody(android.os.Parcel p0) { return null; }
    public int get5Qi() { return 0; }
    public int getQfi() { return 0; }
    public int getAveragingWindow() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
