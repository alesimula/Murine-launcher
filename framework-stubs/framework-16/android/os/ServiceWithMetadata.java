package android.os;

public class ServiceWithMetadata implements android.os.Parcelable {
    public android.os.IBinder service;
    public boolean isLazyService;
    public static final android.os.Parcelable.Creator<android.os.ServiceWithMetadata> CREATOR = null;
    public ServiceWithMetadata() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
