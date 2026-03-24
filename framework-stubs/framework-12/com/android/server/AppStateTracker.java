package com.android.server;

public interface AppStateTracker {
    public static final java.lang.String TAG = "AppStateTracker";
    public void addServiceStateListener(com.android.server.AppStateTracker.ServiceStateListener p0);

    public static interface ServiceStateListener {
        public void stopForegroundServicesForUidPackage(int p0, java.lang.String p1);
    }
}
