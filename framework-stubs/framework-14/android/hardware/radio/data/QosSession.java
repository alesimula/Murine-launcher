package android.hardware.radio.data;

public class QosSession implements android.os.Parcelable {
    public int qosSessionId;
    public android.hardware.radio.data.Qos qos;
    public android.hardware.radio.data.QosFilter[] qosFilters;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.QosSession> CREATOR = null;
    public QosSession() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
