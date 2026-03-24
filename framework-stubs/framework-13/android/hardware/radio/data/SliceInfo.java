package android.hardware.radio.data;

public class SliceInfo implements android.os.Parcelable {
    public byte sliceServiceType;
    public int sliceDifferentiator;
    public byte mappedHplmnSst;
    public int mappedHplmnSd;
    public byte status;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.SliceInfo> CREATOR = null;
    public static final byte SERVICE_TYPE_NONE = 0;
    public static final byte SERVICE_TYPE_EMBB = 1;
    public static final byte SERVICE_TYPE_URLLC = 2;
    public static final byte SERVICE_TYPE_MIOT = 3;
    public static final byte STATUS_UNKNOWN = 0;
    public static final byte STATUS_CONFIGURED = 1;
    public static final byte STATUS_ALLOWED = 2;
    public static final byte STATUS_REJECTED_NOT_AVAILABLE_IN_PLMN = 3;
    public static final byte STATUS_REJECTED_NOT_AVAILABLE_IN_REG_AREA = 4;
    public static final byte STATUS_DEFAULT_CONFIGURED = 5;
    public SliceInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
