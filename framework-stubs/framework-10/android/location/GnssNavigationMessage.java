package android.location;

public final class GnssNavigationMessage implements android.os.Parcelable {
    private static final byte[] EMPTY_ARRAY = null;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_GPS_L1CA = 257;
    public static final int TYPE_GPS_L2CNAV = 258;
    public static final int TYPE_GPS_L5CNAV = 259;
    public static final int TYPE_GPS_CNAV2 = 260;
    public static final int TYPE_GLO_L1CA = 769;
    public static final int TYPE_BDS_D1 = 1281;
    public static final int TYPE_BDS_D2 = 1282;
    public static final int TYPE_GAL_I = 1537;
    public static final int TYPE_GAL_F = 1538;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_PARITY_PASSED = 1;
    public static final int STATUS_PARITY_REBUILT = 2;
    private int mType;
    private int mSvid;
    private int mMessageId;
    private int mSubmessageId;
    private byte[] mData;
    private int mStatus;
    public static final android.os.Parcelable.Creator<android.location.GnssNavigationMessage> CREATOR = null;
    public GnssNavigationMessage() {}
    public void set(android.location.GnssNavigationMessage p0) {}
    public void reset() {}
    public int getType() { return 0; }
    public void setType(int p0) {}
    private java.lang.String getTypeString() { return null; }
    public int getSvid() { return 0; }
    public void setSvid(int p0) {}
    public int getMessageId() { return 0; }
    public void setMessageId(int p0) {}
    public int getSubmessageId() { return 0; }
    public void setSubmessageId(int p0) {}
    public byte[] getData() { return null; }
    public void setData(byte[] p0) {}
    public int getStatus() { return 0; }
    public void setStatus(int p0) {}
    private java.lang.String getStatusString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void initialize() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GnssNavigationMessageType {
    }

    public static abstract class Callback {
        public static final int STATUS_NOT_SUPPORTED = 0;
        public static final int STATUS_READY = 1;
        public static final int STATUS_LOCATION_DISABLED = 2;
        public Callback() {}
        public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) {}
        public void onStatusChanged(int p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface GnssNavigationMessageStatus {
        }
    }
}
