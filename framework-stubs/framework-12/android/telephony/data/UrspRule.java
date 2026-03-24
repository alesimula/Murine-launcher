package android.telephony.data;

public final class UrspRule implements android.os.Parcelable {
    public static final int MIN_URSP_PRECEDENCE = 0;
    public static final int MAX_URSP_PRECEDENCE = 255;
    private final int mPrecedence = 0;
    private final java.util.List<android.telephony.data.TrafficDescriptor> mTrafficDescriptors = null;
    private final java.util.List<android.telephony.data.RouteSelectionDescriptor> mRouteSelectionDescriptor = null;
    public static final android.os.Parcelable.Creator<android.telephony.data.UrspRule> CREATOR = null;
    UrspRule(android.hardware.radio.V1_6.UrspRule p0) {}
    public UrspRule(int p0, java.util.List<android.hardware.radio.V1_6.TrafficDescriptor> p1, java.util.List<android.hardware.radio.V1_6.RouteSelectionDescriptor> p2) {}
    private byte[] arrayListToPrimitiveArray(java.util.ArrayList<java.lang.Byte> p0) { return null; }
    private android.telephony.data.TrafficDescriptor convertToTrafficDescriptor(android.hardware.radio.V1_6.TrafficDescriptor p0) { return null; }
    private UrspRule(android.os.Parcel p0) {}
    public int getPrecedence() { return 0; }
    public java.util.List<android.telephony.data.TrafficDescriptor> getTrafficDescriptors() { return null; }
    public java.util.List<android.telephony.data.RouteSelectionDescriptor> getRouteSelectionDescriptor() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
