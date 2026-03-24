package android.app.admin;

public abstract class NetworkEvent implements android.os.Parcelable {
    static final int PARCEL_TOKEN_DNS_EVENT = 1;
    static final int PARCEL_TOKEN_CONNECT_EVENT = 2;
    java.lang.String mPackageName;
    long mTimestamp;
    long mId;
    public static final android.os.Parcelable.Creator<android.app.admin.NetworkEvent> CREATOR = null;
    NetworkEvent() {}
    NetworkEvent(java.lang.String p0, long p1) {}
    public java.lang.String getPackageName() { return null; }
    public long getTimestamp() { return 0L; }
    public void setId(long p0) {}
    public long getId() { return 0L; }
    public int describeContents() { return 0; }
    public abstract void writeToParcel(android.os.Parcel p0, int p1);
}
