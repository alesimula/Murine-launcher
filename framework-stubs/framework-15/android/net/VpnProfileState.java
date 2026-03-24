package android.net;

public final class VpnProfileState implements android.os.Parcelable {
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_FAILED = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.VpnProfileState> CREATOR = null;
    public VpnProfileState(int p0, java.lang.String p1, boolean p2, boolean p3) {}
    public int getState() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSessionId() { return null; }
    public boolean isAlwaysOn() { return false; }
    public boolean isLockdownEnabled() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
