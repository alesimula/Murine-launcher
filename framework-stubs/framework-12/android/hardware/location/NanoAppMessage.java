package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppMessage implements android.os.Parcelable {
    private static final int DEBUG_LOG_NUM_BYTES = 16;
    private long mNanoAppId;
    private int mMessageType;
    private byte[] mMessageBody;
    private boolean mIsBroadcasted;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppMessage> CREATOR = null;
    private NanoAppMessage(long p0, int p1, byte[] p2, boolean p3) {}
    public static android.hardware.location.NanoAppMessage createMessageToNanoApp(long p0, int p1, byte[] p2) { return null; }
    public static android.hardware.location.NanoAppMessage createMessageFromNanoApp(long p0, int p1, byte[] p2, boolean p3) { return null; }
    public long getNanoAppId() { return 0L; }
    public int getMessageType() { return 0; }
    public byte[] getMessageBody() { return null; }
    public boolean isBroadcastMessage() { return false; }
    private NanoAppMessage(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
}
