package android.net;

public final class QosSession implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.QosSession> CREATOR = null;
    public static final int TYPE_EPS_BEARER = 1;
    public static final int TYPE_NR_BEARER = 2;
    public QosSession(int p0, int p1) {}
    public int describeContents() { return 0; }
    public int getSessionId() { return 0; }
    public int getSessionType() { return 0; }
    public long getUniqueId() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
