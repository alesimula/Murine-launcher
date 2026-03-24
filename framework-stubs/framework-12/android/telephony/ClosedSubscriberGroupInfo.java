package android.telephony;

public final class ClosedSubscriberGroupInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "ClosedSubscriberGroupInfo";
    private final boolean mCsgIndicator = false;
    private final java.lang.String mHomeNodebName = null;
    private final int mCsgIdentity = 0;
    public static final android.os.Parcelable.Creator<android.telephony.ClosedSubscriberGroupInfo> CREATOR = null;
    public ClosedSubscriberGroupInfo(boolean p0, java.lang.String p1, int p2) {}
    public ClosedSubscriberGroupInfo(android.hardware.radio.V1_5.ClosedSubscriberGroupInfo p0) {}
    public boolean getCsgIndicator() { return false; }
    public java.lang.String getHomeNodebName() { return null; }
    public int getCsgIdentity() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private ClosedSubscriberGroupInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    protected static android.telephony.ClosedSubscriberGroupInfo createFromParcelBody(android.os.Parcel p0) { return null; }
}
