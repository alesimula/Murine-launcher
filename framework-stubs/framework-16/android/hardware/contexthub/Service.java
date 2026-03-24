package android.hardware.contexthub;

public class Service implements android.os.Parcelable {
    public int format;
    public java.lang.String serviceDescriptor;
    public int majorVersion;
    public int minorVersion;
    public final android.os.ParcelableHolder extendedInfo = null;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.Service> CREATOR = null;
    public Service() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface RpcFormat {
        public static final int CUSTOM = 0;
        public static final int AIDL = 1;
        public static final int PW_RPC_PROTOBUF = 2;
    }
}
