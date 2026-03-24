package com.android.internal.net;

public class LegacyVpnInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "LegacyVpnInfo";
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_INITIALIZING = 1;
    public static final int STATE_CONNECTING = 2;
    public static final int STATE_CONNECTED = 3;
    public static final int STATE_TIMEOUT = 4;
    public static final int STATE_FAILED = 5;
    public java.lang.String key;
    public int state;
    public android.app.PendingIntent intent;
    public static final android.os.Parcelable.Creator<com.android.internal.net.LegacyVpnInfo> CREATOR = null;
    public LegacyVpnInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static int stateFromNetworkInfo(android.net.NetworkInfo p0) { return 0; }
}
