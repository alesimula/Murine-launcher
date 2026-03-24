package android.hardware.devicestate;

public final class DeviceStateInfo implements android.os.Parcelable {
    public static final int CHANGED_SUPPORTED_STATES = 1;
    public static final int CHANGED_BASE_STATE = 2;
    public static final int CHANGED_CURRENT_STATE = 4;
    @android.annotation.NonNull
    public final java.util.ArrayList<android.hardware.devicestate.DeviceState> supportedStates = null;
    @android.annotation.NonNull
    public final android.hardware.devicestate.DeviceState baseState = null;
    @android.annotation.NonNull
    public final android.hardware.devicestate.DeviceState currentState = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.devicestate.DeviceStateInfo> CREATOR = null;
    public DeviceStateInfo(java.util.ArrayList<android.hardware.devicestate.DeviceState> p0, android.hardware.devicestate.DeviceState p1, android.hardware.devicestate.DeviceState p2) {}
    public DeviceStateInfo(android.hardware.devicestate.DeviceStateInfo p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int diff(android.hardware.devicestate.DeviceStateInfo p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChangeFlags {
    }
}
