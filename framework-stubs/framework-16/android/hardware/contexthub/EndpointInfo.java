package android.hardware.contexthub;

public class EndpointInfo implements android.os.Parcelable {
    public android.hardware.contexthub.EndpointId id;
    public int type;
    public java.lang.String name;
    public int version;
    public java.lang.String tag;
    public java.lang.String[] requiredPermissions;
    public android.hardware.contexthub.Service[] services;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.EndpointInfo> CREATOR = null;
    public EndpointInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface EndpointType {
        public static final int FRAMEWORK = 1;
        public static final int APP = 2;
        public static final int NATIVE = 3;
        public static final int NANOAPP = 4;
        public static final int GENERIC = 5;
    }
}
