package android.net;

@java.lang.Deprecated
public class NetworkInfo implements android.os.Parcelable {
    private static final java.util.EnumMap<android.net.NetworkInfo.DetailedState, android.net.NetworkInfo.State> stateMap = null;
    private int mNetworkType;
    private int mSubtype;
    private java.lang.String mTypeName;
    private java.lang.String mSubtypeName;
    private android.net.NetworkInfo.State mState;
    private android.net.NetworkInfo.DetailedState mDetailedState;
    private java.lang.String mReason;
    private java.lang.String mExtraInfo;
    private boolean mIsFailover;
    private boolean mIsAvailable;
    private boolean mIsRoaming;
    public static final android.os.Parcelable.Creator<android.net.NetworkInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public NetworkInfo(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.UnsupportedAppUsage
    public NetworkInfo(android.net.NetworkInfo p0) {}
    @java.lang.Deprecated
    public int getType() { return 0; }
    @java.lang.Deprecated
    public void setType(int p0) {}
    @java.lang.Deprecated
    public int getSubtype() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setSubtype(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public java.lang.String getTypeName() { return null; }
    @java.lang.Deprecated
    public java.lang.String getSubtypeName() { return null; }
    @java.lang.Deprecated
    public boolean isConnectedOrConnecting() { return false; }
    @java.lang.Deprecated
    public boolean isConnected() { return false; }
    @java.lang.Deprecated
    public boolean isAvailable() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setIsAvailable(boolean p0) {}
    @java.lang.Deprecated
    public boolean isFailover() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setFailover(boolean p0) {}
    @java.lang.Deprecated
    public boolean isRoaming() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setRoaming(boolean p0) {}
    @java.lang.Deprecated
    public android.net.NetworkInfo.State getState() { return null; }
    @java.lang.Deprecated
    public android.net.NetworkInfo.DetailedState getDetailedState() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setDetailedState(android.net.NetworkInfo.DetailedState p0, java.lang.String p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public void setExtraInfo(java.lang.String p0) {}
    public java.lang.String getReason() { return null; }
    @java.lang.Deprecated
    public java.lang.String getExtraInfo() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.Deprecated
    public static enum State {
        CONNECTING,
        CONNECTED,
        SUSPENDED,
        DISCONNECTING,
        DISCONNECTED,
        UNKNOWN;
        private State() {}
    }

    @java.lang.Deprecated
    public static enum DetailedState {
        IDLE,
        SCANNING,
        CONNECTING,
        AUTHENTICATING,
        OBTAINING_IPADDR,
        CONNECTED,
        SUSPENDED,
        DISCONNECTING,
        DISCONNECTED,
        FAILED,
        BLOCKED,
        VERIFYING_POOR_LINK,
        CAPTIVE_PORTAL_CHECK;
        private DetailedState() {}
    }
}
