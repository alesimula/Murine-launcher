package android.hardware.radio.messaging;

public class GsmBroadcastSmsConfigInfo implements android.os.Parcelable {
    public int fromServiceId;
    public int toServiceId;
    public int fromCodeScheme;
    public int toCodeScheme;
    public boolean selected;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.GsmBroadcastSmsConfigInfo> CREATOR = null;
    public GsmBroadcastSmsConfigInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
