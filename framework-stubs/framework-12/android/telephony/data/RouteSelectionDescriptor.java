package android.telephony.data;

public final class RouteSelectionDescriptor implements android.os.Parcelable {
    public static final int MIN_ROUTE_PRECEDENCE = 0;
    public static final int MAX_ROUTE_PRECEDENCE = 255;
    public static final int SESSION_TYPE_IPV4 = 0;
    public static final int SESSION_TYPE_IPV6 = 1;
    public static final int SESSION_TYPE_IPV4V6 = 2;
    public static final int ROUTE_SSC_MODE_1 = 1;
    public static final int ROUTE_SSC_MODE_2 = 2;
    public static final int ROUTE_SSC_MODE_3 = 3;
    public static final int MIN_ROUTE_SSC_MODE = 1;
    public static final int MAX_ROUTE_SSC_MODE = 3;
    private final int mPrecedence = 0;
    private final int mSessionType = 0;
    private final int mSscMode = 0;
    private final java.util.List<android.telephony.data.NetworkSliceInfo> mSliceInfo = null;
    private final java.util.List<java.lang.String> mDnn = null;
    public static final android.os.Parcelable.Creator<android.telephony.data.RouteSelectionDescriptor> CREATOR = null;
    RouteSelectionDescriptor(android.hardware.radio.V1_6.RouteSelectionDescriptor p0) {}
    public RouteSelectionDescriptor(int p0, int p1, int p2, java.util.List<android.hardware.radio.V1_6.SliceInfo> p3, java.util.List<java.lang.String> p4) {}
    private android.telephony.data.NetworkSliceInfo sliceInfoBuilder(android.hardware.radio.V1_6.SliceInfo p0) { return null; }
    private RouteSelectionDescriptor(android.os.Parcel p0) {}
    public int getPrecedence() { return 0; }
    public int getSessionType() { return 0; }
    public int getSscMode() { return 0; }
    public java.util.List<android.telephony.data.NetworkSliceInfo> getSliceInfo() { return null; }
    public java.util.List<java.lang.String> getDataNetworkName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RouteSessionType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RouteSscMode {
    }
}
