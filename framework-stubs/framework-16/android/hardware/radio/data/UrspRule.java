package android.hardware.radio.data;

public class UrspRule implements android.os.Parcelable {
    public int precedence;
    public android.hardware.radio.data.TrafficDescriptor[] trafficDescriptors;
    public android.hardware.radio.data.RouteSelectionDescriptor[] routeSelectionDescriptor;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.UrspRule> CREATOR = null;
    public UrspRule() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
