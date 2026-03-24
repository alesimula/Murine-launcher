package android.telephony.data;

public final class EpsQos extends android.telephony.data.Qos implements android.os.Parcelable {
    int qosClassId;
    public static final android.os.Parcelable.Creator<android.telephony.data.EpsQos> CREATOR = null;
    public EpsQos() { super((android.os.Parcel)null); }
    public EpsQos(android.hardware.radio.V1_6.EpsQos p0) { super((android.os.Parcel)null); }
    private EpsQos(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int getQci() { return 0; }
    public static android.telephony.data.EpsQos createFromParcelBody(android.os.Parcel p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
