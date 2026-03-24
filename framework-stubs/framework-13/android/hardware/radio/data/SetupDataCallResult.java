package android.hardware.radio.data;

public class SetupDataCallResult implements android.os.Parcelable {
    public int cause;
    public long suggestedRetryTime;
    public int cid;
    public int active;
    public int type;
    public java.lang.String ifname;
    public android.hardware.radio.data.LinkAddress[] addresses;
    public java.lang.String[] dnses;
    public java.lang.String[] gateways;
    public java.lang.String[] pcscf;
    public int mtuV4;
    public int mtuV6;
    public android.hardware.radio.data.Qos defaultQos;
    public android.hardware.radio.data.QosSession[] qosSessions;
    public byte handoverFailureMode;
    public int pduSessionId;
    public android.hardware.radio.data.SliceInfo sliceInfo;
    public android.hardware.radio.data.TrafficDescriptor[] trafficDescriptors;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.SetupDataCallResult> CREATOR = null;
    public static final int DATA_CONNECTION_STATUS_INACTIVE = 0;
    public static final int DATA_CONNECTION_STATUS_DORMANT = 1;
    public static final int DATA_CONNECTION_STATUS_ACTIVE = 2;
    public static final byte HANDOVER_FAILURE_MODE_LEGACY = 0;
    public static final byte HANDOVER_FAILURE_MODE_DO_FALLBACK = 1;
    public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_HANDOVER = 2;
    public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_SETUP_NORMAL = 3;
    public SetupDataCallResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
