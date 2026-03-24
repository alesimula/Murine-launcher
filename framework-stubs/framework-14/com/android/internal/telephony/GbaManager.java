package com.android.internal.telephony;

public class GbaManager {
    public static final int RETRY_TIME_MS = 3000;
    public static final int MAX_RETRY = 5;
    public static final int REQUEST_TIMEOUT_MS = 5000;
    public GbaManager(android.content.Context p0, int p1, java.lang.String p2, int p3, com.android.internal.telephony.metrics.RcsStats p4) {}
    public static com.android.internal.telephony.GbaManager make(android.content.Context p0, int p1, java.lang.String p2, int p3) { return null; }
    public static com.android.internal.telephony.GbaManager getInstance(int p0) { return null; }
    public void bootstrapAuthenticationRequest(android.telephony.gba.GbaAuthRequest p0) {}
    public boolean isServiceConnected() { return false; }
    public boolean overrideServicePackage(java.lang.String p0) { return false; }
    public java.lang.String getServicePackage() { return null; }
    public boolean overrideReleaseTime(int p0) { return false; }
    public int getReleaseTime() { return 0; }
    public android.os.Handler getHandler() { return null; }
    public void destroy() {}

    private final class GbaDeathRecipient implements android.os.IBinder.DeathRecipient {
        GbaDeathRecipient(com.android.internal.telephony.GbaManager p0, android.content.ComponentName p1) {}
        public void linkToDeath(android.os.IBinder p0) throws android.os.RemoteException {}
        public synchronized void unlinkToDeath() {}
        public void binderDied() {}
    }

    private final class GbaManagerHandler extends android.os.Handler {
        GbaManagerHandler(com.android.internal.telephony.GbaManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class GbaServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
    }
}
