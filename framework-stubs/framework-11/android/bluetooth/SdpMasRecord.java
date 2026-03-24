package android.bluetooth;

public class SdpMasRecord implements android.os.Parcelable {
    private final int mMasInstanceId = 0;
    private final int mL2capPsm = 0;
    private final int mRfcommChannelNumber = 0;
    private final int mProfileVersion = 0;
    private final int mSupportedFeatures = 0;
    private final int mSupportedMessageTypes = 0;
    private final java.lang.String mServiceName = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    public SdpMasRecord(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6) {}
    public SdpMasRecord(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getMasInstanceId() { return 0; }
    public int getL2capPsm() { return 0; }
    public int getRfcommCannelNumber() { return 0; }
    public int getProfileVersion() { return 0; }
    public int getSupportedFeatures() { return 0; }
    public int getSupportedMessageTypes() { return 0; }
    public boolean msgSupported(int p0) { return false; }
    public java.lang.String getServiceName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class MessageType {
        public static final int EMAIL = 1;
        public static final int SMS_GSM = 2;
        public static final int SMS_CDMA = 4;
        public static final int MMS = 8;
        public MessageType() {}
    }
}
