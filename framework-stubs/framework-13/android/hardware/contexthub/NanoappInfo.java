package android.hardware.contexthub;

public class NanoappInfo implements android.os.Parcelable {
    public long nanoappId;
    public int nanoappVersion;
    public boolean enabled;
    public java.lang.String[] permissions;
    public android.hardware.contexthub.NanoappRpcService[] rpcServices;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.NanoappInfo> CREATOR = null;
    public NanoappInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
