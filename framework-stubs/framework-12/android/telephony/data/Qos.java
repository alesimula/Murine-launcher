package android.telephony.data;

public abstract class Qos {
    final int type = 0;
    static final int QOS_TYPE_EPS = 1;
    static final int QOS_TYPE_NR = 2;
    final android.telephony.data.Qos.QosBandwidth downlink = null;
    final android.telephony.data.Qos.QosBandwidth uplink = null;
    Qos(int p0, android.hardware.radio.V1_6.QosBandwidth p1, android.hardware.radio.V1_6.QosBandwidth p2) {}
    public android.telephony.data.Qos.QosBandwidth getDownlinkBandwidth() { return null; }
    public android.telephony.data.Qos.QosBandwidth getUplinkBandwidth() { return null; }
    protected Qos(android.os.Parcel p0) {}
    public void writeToParcel(int p0, android.os.Parcel p1, int p2) {}
    public static android.telephony.data.Qos create(android.hardware.radio.V1_6.Qos p0) { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static class QosBandwidth implements android.os.Parcelable {
        int maxBitrateKbps;
        int guaranteedBitrateKbps;
        public static final android.os.Parcelable.Creator<android.telephony.data.Qos.QosBandwidth> CREATOR = null;
        QosBandwidth() {}
        QosBandwidth(int p0, int p1) {}
        private QosBandwidth(android.os.Parcel p0) {}
        public int getMaxBitrateKbps() { return 0; }
        public int getGuaranteedBitrateKbps() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QosType {
    }
}
