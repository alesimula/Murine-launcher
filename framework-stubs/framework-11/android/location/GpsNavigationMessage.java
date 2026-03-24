package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsNavigationMessage implements android.os.Parcelable {
    private static final byte[] EMPTY_ARRAY = null;
    public static final byte TYPE_UNKNOWN = 0;
    public static final byte TYPE_L1CA = 1;
    public static final byte TYPE_L2CNAV = 2;
    public static final byte TYPE_L5CNAV = 3;
    public static final byte TYPE_CNAV2 = 4;
    public static final short STATUS_UNKNOWN = 0;
    public static final short STATUS_PARITY_PASSED = 1;
    public static final short STATUS_PARITY_REBUILT = 2;
    private byte mType;
    private byte mPrn;
    private short mMessageId;
    private short mSubmessageId;
    private byte[] mData;
    private short mStatus;
    public static final android.os.Parcelable.Creator<android.location.GpsNavigationMessage> CREATOR = null;
    GpsNavigationMessage() {}
    public void set(android.location.GpsNavigationMessage p0) {}
    public void reset() {}
    public byte getType() { return 0; }
    public void setType(byte p0) {}
    private java.lang.String getTypeString() { return null; }
    public byte getPrn() { return 0; }
    public void setPrn(byte p0) {}
    public short getMessageId() { return 0; }
    public void setMessageId(short p0) {}
    public short getSubmessageId() { return 0; }
    public void setSubmessageId(short p0) {}
    public byte[] getData() { return null; }
    public void setData(byte[] p0) {}
    public short getStatus() { return 0; }
    public void setStatus(short p0) {}
    private java.lang.String getStatusString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void initialize() {}
}
