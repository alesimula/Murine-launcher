package com.android.internal.content;

public abstract class PackageMonitor extends android.content.BroadcastReceiver {
    static final java.lang.String TAG = "PackageMonitor";
    static final android.content.IntentFilter sPackageFilt = null;
    static final android.content.IntentFilter sNonDataFilt = null;
    static final android.content.IntentFilter sExternalFilt = null;
    final java.util.HashSet<java.lang.String> mUpdatingPackages = null;
    android.content.Context mRegisteredContext;
    android.os.Handler mRegisteredHandler;
    java.lang.String[] mDisappearingPackages;
    java.lang.String[] mAppearingPackages;
    java.lang.String[] mModifiedPackages;
    int mChangeType;
    int mChangeUserId;
    boolean mSomePackagesChanged;
    java.lang.String[] mModifiedComponents;
    java.lang.String[] mTempArray;
    public static final int PACKAGE_UNCHANGED = 0;
    public static final int PACKAGE_UPDATING = 1;
    public static final int PACKAGE_TEMPORARY_CHANGE = 2;
    public static final int PACKAGE_PERMANENT_CHANGE = 3;
    public PackageMonitor() { super(); }
    public void register(android.content.Context p0, android.os.Looper p1, boolean p2) {}
    public void register(android.content.Context p0, android.os.Looper p1, android.os.UserHandle p2, boolean p3) {}
    public void register(android.content.Context p0, android.os.UserHandle p1, boolean p2, android.os.Handler p3) {}
    public android.os.Handler getRegisteredHandler() { return null; }
    public void unregister() {}
    boolean isPackageUpdating(java.lang.String p0) { return false; }
    public void onBeginPackageChanges() {}
    public void onPackageAdded(java.lang.String p0, int p1) {}
    public void onPackageRemoved(java.lang.String p0, int p1) {}
    public void onPackageRemovedAllUsers(java.lang.String p0, int p1) {}
    public void onPackageUpdateStarted(java.lang.String p0, int p1) {}
    public void onPackageUpdateFinished(java.lang.String p0, int p1) {}
    public boolean onPackageChanged(java.lang.String p0, int p1, java.lang.String[] p2) { return false; }
    public boolean onHandleForceStop(android.content.Intent p0, java.lang.String[] p1, int p2, boolean p3) { return false; }
    public void onHandleUserStop(android.content.Intent p0, int p1) {}
    public void onUidRemoved(int p0) {}
    public void onPackagesAvailable(java.lang.String[] p0) {}
    public void onPackagesUnavailable(java.lang.String[] p0) {}
    public void onPackagesSuspended(java.lang.String[] p0) {}
    public void onPackagesUnsuspended(java.lang.String[] p0) {}
    public void onPackageDisappeared(java.lang.String p0, int p1) {}
    public void onPackageAppeared(java.lang.String p0, int p1) {}
    public void onPackageModified(java.lang.String p0) {}
    public boolean didSomePackagesChange() { return false; }
    public int isPackageAppearing(java.lang.String p0) { return 0; }
    public boolean anyPackagesAppearing() { return false; }
    public int isPackageDisappearing(java.lang.String p0) { return 0; }
    public boolean anyPackagesDisappearing() { return false; }
    public boolean isReplacing() { return false; }
    public boolean isPackageModified(java.lang.String p0) { return false; }
    public boolean isComponentModified(java.lang.String p0) { return false; }
    public void onSomePackagesChanged() {}
    public void onFinishPackageChanges() {}
    public void onPackageDataCleared(java.lang.String p0, int p1) {}
    public void onPackageStateChanged(java.lang.String p0, int p1) {}
    public int getChangingUserId() { return 0; }
    java.lang.String getPackageName(android.content.Intent p0) { return null; }
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
}
