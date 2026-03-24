package com.android.internal.telephony.data;

public class DataSettingsManager extends android.os.Handler {
    public DataSettingsManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, android.os.Looper p2, com.android.internal.telephony.data.DataSettingsManager.DataSettingsManagerCallback p3) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void setDataEnabled(int p0, boolean p1, java.lang.String p2) {}
    public boolean isDataEnabledForReason(int p0) { return false; }
    public boolean isDataEnabled() { return false; }
    public boolean isDataInitialized() { return false; }
    public boolean isDataEnabled(int p0) { return false; }
    public void setDataRoamingEnabled(boolean p0) {}
    public boolean isDataRoamingEnabled() { return false; }
    public boolean isDefaultDataRoamingEnabled() { return false; }
    public void setDefaultDataRoamingEnabled() {}
    public boolean isMobileDataPolicyEnabled(int p0) { return false; }
    public void setMobileDataPolicy(int p0, boolean p1) {}
    public boolean isRecoveryOnBadNetworkEnabled() { return false; }
    public java.util.Set<java.lang.Integer> getMobileDataPolicyEnabled(java.lang.String p0) { return null; }
    public void registerCallback(com.android.internal.telephony.data.DataSettingsManager.DataSettingsManagerCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.DataSettingsManager.DataSettingsManagerCallback p0) {}
    public java.lang.String toString() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class DataSettingsManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataSettingsManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onDataEnabledChanged(boolean p0, int p1, java.lang.String p2) {}
        public void onDataEnabledOverrideChanged(boolean p0, int p1) {}
        public void onDataRoamingEnabledChanged(boolean p0) {}
    }
}
