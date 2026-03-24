package android.hardware.radio.V1_6;

public final class SetupDataCallResult {
    public int cause;
    public long suggestedRetryTime;
    public int cid;
    public int active;
    public int type;
    public java.lang.String ifname;
    public java.util.ArrayList<android.hardware.radio.V1_5.LinkAddress> addresses;
    public java.util.ArrayList<java.lang.String> dnses;
    public java.util.ArrayList<java.lang.String> gateways;
    public java.util.ArrayList<java.lang.String> pcscf;
    public int mtuV4;
    public int mtuV6;
    public android.hardware.radio.V1_6.Qos defaultQos;
    public java.util.ArrayList<android.hardware.radio.V1_6.QosSession> qosSessions;
    public byte handoverFailureMode;
    public int pduSessionId;
    public android.hardware.radio.V1_6.OptionalSliceInfo sliceInfo;
    public java.util.ArrayList<android.hardware.radio.V1_6.TrafficDescriptor> trafficDescriptors;
    public SetupDataCallResult() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_6.SetupDataCallResult> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_6.SetupDataCallResult> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
