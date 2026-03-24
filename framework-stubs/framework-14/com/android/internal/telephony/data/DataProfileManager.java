package com.android.internal.telephony.data;

public class DataProfileManager extends android.os.Handler {
    public DataProfileManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, com.android.internal.telephony.data.DataServiceManager p2, android.os.Looper p3, com.android.internal.telephony.data.DataProfileManager.DataProfileManagerCallback p4) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public android.telephony.data.DataProfile getDataProfileForNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0, int p1, boolean p2) { return null; }
    public boolean isDataProfilePreferred(android.telephony.data.DataProfile p0) { return false; }
    public boolean canPreferredDataProfileSatisfy(com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p0) { return false; }
    public boolean isTetheringDataProfileExisting(int p0) { return false; }
    public boolean isDataProfileCompatible(android.telephony.data.DataProfile p0) { return false; }
    public boolean areDataProfilesSharingApn(android.telephony.data.DataProfile p0, android.telephony.data.DataProfile p1) { return false; }
    public void registerCallback(com.android.internal.telephony.data.DataProfileManager.DataProfileManagerCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.DataProfileManager.DataProfileManagerCallback p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static abstract class DataProfileManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataProfileManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public abstract void onDataProfilesChanged();
    }
}
