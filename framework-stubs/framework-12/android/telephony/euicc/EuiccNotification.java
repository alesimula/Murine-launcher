package android.telephony.euicc;

@android.annotation.SystemApi
public final class EuiccNotification implements android.os.Parcelable {
    public static final int EVENT_INSTALL = 1;
    public static final int EVENT_ENABLE = 2;
    public static final int EVENT_DISABLE = 4;
    public static final int EVENT_DELETE = 8;
    public static final int ALL_EVENTS = 15;
    private final int mSeq = 0;
    private final java.lang.String mTargetAddr = null;
    private final int mEvent = 0;
    private final byte[] mData = null;
    public static final android.os.Parcelable.Creator<android.telephony.euicc.EuiccNotification> CREATOR = null;
    public EuiccNotification(int p0, java.lang.String p1, int p2, byte[] p3) {}
    public int getSeq() { return 0; }
    public java.lang.String getTargetAddr() { return null; }
    public int getEvent() { return 0; }
    public byte[] getData() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private EuiccNotification(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }
}
