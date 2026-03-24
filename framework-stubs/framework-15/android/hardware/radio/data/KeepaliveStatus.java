package android.hardware.radio.data;

public class KeepaliveStatus implements android.os.Parcelable {
    public int sessionHandle;
    public int code;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.KeepaliveStatus> CREATOR = null;
    public static final int CODE_ACTIVE = 0;
    public static final int CODE_INACTIVE = 1;
    public static final int CODE_PENDING = 2;
    public KeepaliveStatus() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
