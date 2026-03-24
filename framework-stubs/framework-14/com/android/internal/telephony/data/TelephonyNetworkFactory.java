package com.android.internal.telephony.data;

public class TelephonyNetworkFactory extends com.android.internal.telephony.NetworkFactory {
    public final java.lang.String LOG_TAG = null;
    protected static final boolean DBG = true;
    public static final int EVENT_ACTIVE_PHONE_SWITCH = 1;
    public static final int EVENT_SUBSCRIPTION_CHANGED = 2;
    public final android.os.Handler mInternalHandler = null;
    public TelephonyNetworkFactory(android.os.Looper p0, com.android.internal.telephony.Phone p1) { super(null, null, null, null); }
    public android.net.NetworkCapabilities makeNetworkFilter(int p0) { return null; }
    public void needNetworkFor(android.net.NetworkRequest p0) {}
    public void releaseNetworkFor(android.net.NetworkRequest p0) {}
    protected void log(java.lang.String p0) {}
    protected void logl(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class InternalHandler extends android.os.Handler {
        InternalHandler(com.android.internal.telephony.data.TelephonyNetworkFactory p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
