package android.hardware.radio.data;

public class RouteSelectionDescriptor implements android.os.Parcelable {
    public byte precedence;
    public int sessionType;
    public byte sscMode;
    public android.hardware.radio.data.SliceInfo[] sliceInfo;
    public java.lang.String[] dnn;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.RouteSelectionDescriptor> CREATOR = null;
    public static final byte SSC_MODE_UNKNOWN = -1;
    public static final byte SSC_MODE_1 = 1;
    public static final byte SSC_MODE_2 = 2;
    public static final byte SSC_MODE_3 = 3;
    public RouteSelectionDescriptor() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
