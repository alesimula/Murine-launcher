package android.hardware.radio.network;

public class OperatorInfo implements android.os.Parcelable {
    public java.lang.String alphaLong;
    public java.lang.String alphaShort;
    public java.lang.String operatorNumeric;
    public int status;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.OperatorInfo> CREATOR = null;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_AVAILABLE = 1;
    public static final int STATUS_CURRENT = 2;
    public static final int STATUS_FORBIDDEN = 3;
    public OperatorInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
