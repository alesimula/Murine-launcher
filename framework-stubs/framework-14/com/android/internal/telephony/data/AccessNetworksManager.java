package com.android.internal.telephony.data;

public class AccessNetworksManager extends android.os.Handler {
    public static final int[] SUPPORTED_APN_TYPES = null;
    public void handleMessage(android.os.Message p0) {}
    public AccessNetworksManager(com.android.internal.telephony.Phone p0, android.os.Looper p1) { super(); }
    public void registerForQualifiedNetworksChanged(android.os.Handler p0, int p1) {}
    public int[] getAvailableTransports() { return null; }
    public int getPreferredTransport(int p0) { return 0; }
    public int getPreferredTransportByNetworkCapability(int p0) { return 0; }
    public boolean isAnyApnOnIwlan() { return false; }
    public void unregisterForQualifiedNetworksChanged(android.os.Handler p0) {}
    public void registerCallback(com.android.internal.telephony.data.AccessNetworksManager.AccessNetworksManagerCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.AccessNetworksManager.AccessNetworksManagerCallback p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static abstract class AccessNetworksManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public AccessNetworksManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public abstract void onPreferredTransportChanged(int p0);
    }

    private class AccessNetworksManagerDeathRecipient implements android.os.IBinder.DeathRecipient {
        public void binderDied() {}
    }

    public static class QualifiedNetworks {
        public final int apnType = 0;
        public final int[] qualifiedNetworks = null;
        public QualifiedNetworks(int p0, int[] p1) {}
        public java.lang.String toString() { return null; }
    }

    private final class QualifiedNetworksServiceCallback extends android.telephony.data.IQualifiedNetworksServiceCallback.Stub {
        public void onQualifiedNetworkTypesChanged(int p0, int[] p1) {}
    }

    private final class QualifiedNetworksServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
