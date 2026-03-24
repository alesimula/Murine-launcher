package com.android.server;

public interface AppStateTracker {
    public static final java.lang.String TAG = "AppStateTracker";
    public void addBackgroundRestrictedAppListener(com.android.server.AppStateTracker.BackgroundRestrictedAppListener p0);
    public boolean isAppBackgroundRestricted(int p0, java.lang.String p1);

    public static interface BackgroundRestrictedAppListener {
        public void updateBackgroundRestrictedForUidPackage(int p0, java.lang.String p1, boolean p2);
    }
}
