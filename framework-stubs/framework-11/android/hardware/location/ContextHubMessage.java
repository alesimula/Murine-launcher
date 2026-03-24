package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class ContextHubMessage implements android.os.Parcelable {
    private static final int DEBUG_LOG_NUM_BYTES = 16;
    private int mType;
    private int mVersion;
    private byte[] mData;
    public static final android.os.Parcelable.Creator<android.hardware.location.ContextHubMessage> CREATOR = null;
    public int getMsgType() { return 0; }
    public int getVersion() { return 0; }
    public byte[] getData() { return null; }
    public void setMsgType(int p0) {}
    public void setVersion(int p0) {}
    public void setMsgData(byte[] p0) {}
    public ContextHubMessage(int p0, int p1, byte[] p2) {}
    public int describeContents() { return 0; }
    private ContextHubMessage(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
