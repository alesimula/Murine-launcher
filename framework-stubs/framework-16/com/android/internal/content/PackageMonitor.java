package com.android.internal.content;

public abstract class PackageMonitor extends android.content.BroadcastReceiver {
    static final java.lang.String TAG = "PackageMonitor";
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
    com.android.internal.content.PackageMonitor.PackageMonitorCallback mPackageMonitorCallback;
    final boolean mSupportsPackageRestartQuery = false;
    public static final int PACKAGE_UNCHANGED = 0;
    public static final int PACKAGE_UPDATING = 1;
    public static final int PACKAGE_TEMPORARY_CHANGE = 2;
    public static final int PACKAGE_PERMANENT_CHANGE = 3;
    public PackageMonitor() { super(); }
    public PackageMonitor(boolean p0) { super(); }
    public void register(android.content.Context p0, android.os.Looper p1, boolean p2) {}
    public void register(android.content.Context p0, android.os.Looper p1, android.os.UserHandle p2, boolean p3) {}
    public void register(android.content.Context p0, android.os.UserHandle p1, android.os.Handler p2) {}
    public android.os.Handler getRegisteredHandler() { return null; }
    public void unregister() {}
    public void onBeginPackageChanges() {}
    public void onPackageAdded(java.lang.String p0, int p1) {}
    public void onPackageAddedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageRemoved(java.lang.String p0, int p1) {}
    public void onPackageRemovedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageRemovedAllUsers(java.lang.String p0, int p1) {}
    public void onPackageRemovedAllUsersWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageUpdateStarted(java.lang.String p0, int p1) {}
    public void onPackageUpdateStartedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public void onPackageUpdateFinished(java.lang.String p0, int p1) {}
    public void onPackageUpdateFinishedWithExtras(java.lang.String p0, int p1, android.os.Bundle p2) {}
    public boolean onPackageChanged(java.lang.String p0, int p1, java.lang.String[] p2) { return false; }
    public void onPackageChangedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public boolean onHandleForceStop(android.content.Intent p0, java.lang.String[] p1, int p2, boolean p3, android.os.Bundle p4) { return false; }
    public boolean onHandleForceStop(android.content.Intent p0, java.lang.String[] p1, int p2, boolean p3) { return false; }
    public void onUidRemoved(int p0) {}
    public void onPackagesAvailable(java.lang.String[] p0) {}
    public void onPackagesUnavailable(java.lang.String[] p0) {}
    public void onPackagesSuspended(java.lang.String[] p0) {}
    public void onPackagesUnsuspended(java.lang.String[] p0) {}
    public void onPackageDisappeared(java.lang.String p0, int p1) {}
    public void onPackageDisappearedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageAppeared(java.lang.String p0, int p1) {}
    public void onPackageAppearedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageModified(java.lang.String p0) {}
    public void onPackageModifiedWithExtras(java.lang.String p0, android.os.Bundle p1) {}
    public void onPackageUnstopped(java.lang.String p0, int p1, android.os.Bundle p2) {}
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
    public final void doHandlePackageEvent(android.content.Intent p0) {}

    private static final class PackageMonitorCallback extends android.os.IRemoteCallback.Stub {
        PackageMonitorCallback(com.android.internal.content.PackageMonitor p0) { super(); }
        public void sendResult(android.os.Bundle p0) throws android.os.RemoteException {}
    }
}
