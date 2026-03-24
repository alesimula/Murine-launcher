package android.hardware.security.keymint;

public class RpcHardwareInfo implements android.os.Parcelable {
    public int versionNumber;
    public java.lang.String rpcAuthorName;
    public int supportedEekCurve;
    public java.lang.String uniqueId;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.RpcHardwareInfo> CREATOR = null;
    public static final int CURVE_NONE = 0;
    public static final int CURVE_P256 = 1;
    public static final int CURVE_25519 = 2;
    public RpcHardwareInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
