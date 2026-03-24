package com.android.internal.telephony;

public class ClientWakelockTracker {
    public static final java.lang.String LOG_TAG = "ClientWakelockTracker";
    public java.util.HashMap<java.lang.String, com.android.internal.telephony.ClientWakelockAccountant> mClients;
    public java.util.ArrayList<com.android.internal.telephony.ClientWakelockAccountant> mActiveClients;
    public ClientWakelockTracker() {}
    public void startTracking(java.lang.String p0, int p1, int p2, int p3) {}
    public void stopTracking(java.lang.String p0, int p1, int p2, int p3) {}
    public void stopTrackingAll() {}
    java.util.List<android.telephony.ClientRequestStats> getClientRequestStats() { return null; }
    public boolean isClientActive(java.lang.String p0) { return false; }
    void dumpClientRequestTracker(java.io.PrintWriter p0) {}
}
