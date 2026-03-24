package com.android.internal.telephony;

public class CarrierServiceBindHelper {
    public android.util.SparseArray<com.android.internal.telephony.CarrierServiceBindHelper.AppBinding> mBindings;
    public android.util.SparseArray<java.lang.String> mLastSimState;
    public static final int EVENT_PERFORM_IMMEDIATE_UNBIND = 1;
    public static final int EVENT_MULTI_SIM_CONFIG_CHANGED = 2;
    public android.os.Handler mHandler;
    public CarrierServiceBindHelper(android.content.Context p0) {}
    public void updateForPhoneId(int p0, java.lang.String p1) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class AppBinding {
        public AppBinding(com.android.internal.telephony.CarrierServiceBindHelper p0, int p1) {}
        public void tearDown() {}
        public int getPhoneId() { return 0; }
        public java.lang.String getPackage() { return null; }
        void rebind() {}
        void unbind(boolean p0) {}
        public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    }

    private class CarrierServiceChangeCallback implements android.telephony.TelephonyManager.CarrierPrivilegesCallback {
        final int mPhoneId = 0;
        CarrierServiceChangeCallback(com.android.internal.telephony.CarrierServiceBindHelper p0, int p1) {}
        public void onCarrierPrivilegesChanged(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.Integer> p1) {}
        public void onCarrierServiceChanged(java.lang.String p0, int p1) {}
    }

    private class CarrierServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void onNullBinding(android.content.ComponentName p0) {}
        public java.lang.String toString() { return null; }
    }

    private class CarrierServicePackageMonitor extends com.android.internal.telephony.PackageChangeReceiver {
        public void onPackageAdded(java.lang.String p0) {}
        public void onPackageRemoved(java.lang.String p0) {}
        public void onPackageUpdateFinished(java.lang.String p0) {}
        public void onPackageModified(java.lang.String p0) {}
        public void onHandleForceStop(java.lang.String[] p0, boolean p1) {}
    }
}
