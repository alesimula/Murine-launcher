package android.os;

public final class Service implements android.os.Parcelable {
    public static final int serviceWithMetadata = 0;
    public static final int accessor = 1;
    public static final android.os.Parcelable.Creator<android.os.Service> CREATOR = null;
    public Service() {}
    public int getTag() { return 0; }
    public static android.os.Service serviceWithMetadata(android.os.ServiceWithMetadata p0) { return null; }
    public android.os.ServiceWithMetadata getServiceWithMetadata() { return null; }
    public void setServiceWithMetadata(android.os.ServiceWithMetadata p0) {}
    public static android.os.Service accessor(android.os.IBinder p0) { return null; }
    public android.os.IBinder getAccessor() { return null; }
    public void setAccessor(android.os.IBinder p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int serviceWithMetadata = 0;
        public static final int accessor = 1;
    }
}
