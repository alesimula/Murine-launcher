package com.android.internal.telephony.ims;

public class ImsServiceFeatureQueryManager {
    public ImsServiceFeatureQueryManager(android.content.Context p0, com.android.internal.telephony.ims.ImsServiceFeatureQueryManager.Listener p1) {}
    public boolean startQuery(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean isQueryInProgress() { return false; }

    private final class ImsServiceFeatureQuery implements android.content.ServiceConnection {
        ImsServiceFeatureQuery(com.android.internal.telephony.ims.ImsServiceFeatureQueryManager p0, android.content.ComponentName p1, java.lang.String p2) {}
        public boolean start() { return false; }
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onNullBinding(android.content.ComponentName p0) {}
    }

    public static interface Listener {
        public void onComplete(android.content.ComponentName p0, java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> p1);
        public void onError(android.content.ComponentName p0);
        public void onPermanentError(android.content.ComponentName p0);
    }
}
