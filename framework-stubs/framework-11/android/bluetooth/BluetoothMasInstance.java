package android.bluetooth;

public final class BluetoothMasInstance implements android.os.Parcelable {
    private final int mId = 0;
    private final java.lang.String mName = null;
    private final int mChannel = 0;
    private final int mMsgTypes = 0;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothMasInstance> CREATOR = null;
    public BluetoothMasInstance(int p0, java.lang.String p1, int p2, int p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    public int getChannel() { return 0; }
    public int getMsgTypes() { return 0; }
    public boolean msgSupported(int p0) { return false; }

    public static final class MessageType {
        public static final int EMAIL = 1;
        public static final int SMS_GSM = 2;
        public static final int SMS_CDMA = 4;
        public static final int MMS = 8;
        public MessageType() {}
    }
}
