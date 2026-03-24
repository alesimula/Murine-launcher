package android.net;

@java.lang.Deprecated
public class NetworkInfo implements android.os.Parcelable {
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.NetworkInfo> CREATOR = null;
    @java.lang.Deprecated
    public NetworkInfo(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @java.lang.Deprecated
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.NetworkInfo.DetailedState getDetailedState() { return null; }
    @java.lang.Deprecated
    public java.lang.String getExtraInfo() { return null; }
    @java.lang.Deprecated
    public java.lang.String getReason() { return null; }
    @java.lang.Deprecated
    public android.net.NetworkInfo.State getState() { return null; }
    @java.lang.Deprecated
    public int getSubtype() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getSubtypeName() { return null; }
    @java.lang.Deprecated
    public int getType() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getTypeName() { return null; }
    @java.lang.Deprecated
    public boolean isAvailable() { return false; }
    @java.lang.Deprecated
    public boolean isConnected() { return false; }
    @java.lang.Deprecated
    public boolean isConnectedOrConnecting() { return false; }
    @java.lang.Deprecated
    public boolean isFailover() { return false; }
    @java.lang.Deprecated
    public boolean isRoaming() { return false; }
    @java.lang.Deprecated
    public void setDetailedState(android.net.NetworkInfo.DetailedState p0, java.lang.String p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.Deprecated
    public static enum DetailedState {
        AUTHENTICATING,
        BLOCKED,
        CAPTIVE_PORTAL_CHECK,
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        FAILED,
        IDLE,
        OBTAINING_IPADDR,
        SCANNING,
        SUSPENDED,
        VERIFYING_POOR_LINK;
        private DetailedState() {}
    }

    @java.lang.Deprecated
    public static enum State {
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        SUSPENDED,
        UNKNOWN;
        private State() {}
    }
}
