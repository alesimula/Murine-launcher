package com.android.internal.telephony;

public abstract class PackageChangeReceiver extends android.content.BroadcastReceiver {
    static final android.content.IntentFilter sPackageIntentFilter = null;
    android.content.Context mRegisteredContext;
    public PackageChangeReceiver() { super(); }
    public void register(android.content.Context p0, android.os.Looper p1, android.os.UserHandle p2) {}
    public void unregister() {}
    public void onPackageAdded(java.lang.String p0) {}
    public void onPackageRemoved(java.lang.String p0) {}
    public void onPackageUpdateFinished(java.lang.String p0) {}
    public void onPackageModified(java.lang.String p0) {}
    public void onHandleForceStop(java.lang.String[] p0, boolean p1) {}
    public void onPackageDisappeared() {}
    public void onPackageAppeared() {}
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    java.lang.String getPackageName(android.content.Intent p0) { return null; }
}
