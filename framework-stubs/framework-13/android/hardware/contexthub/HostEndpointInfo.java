package android.hardware.contexthub;

public class HostEndpointInfo implements android.os.Parcelable {
    public char hostEndpointId;
    public int type;
    public java.lang.String packageName;
    public java.lang.String attributionTag;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HostEndpointInfo> CREATOR = null;
    public HostEndpointInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Type {
        public static final int FRAMEWORK = 1;
        public static final int APP = 2;
    }
}
