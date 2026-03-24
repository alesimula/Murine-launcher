package android.hardware.input;

public class AidlKeyGestureEvent implements android.os.Parcelable {
    public int deviceId;
    public int[] keycodes;
    public int modifierState;
    public int gestureType;
    public int action;
    public int displayId;
    public int flags;
    public java.lang.String appLaunchCategory;
    public java.lang.String appLaunchRole;
    public java.lang.String appLaunchPackageName;
    public java.lang.String appLaunchClassName;
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlKeyGestureEvent> CREATOR = null;
    public AidlKeyGestureEvent() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
