package com.android.internal.telephony;

public class ClientWakelockAccountant {
    public static final java.lang.String LOG_TAG = "ClientWakelockAccountant: ";
    public android.telephony.ClientRequestStats mRequestStats;
    public java.util.ArrayList<com.android.internal.telephony.RilWakelockInfo> mPendingRilWakelocks;
    public ClientWakelockAccountant(java.lang.String p0) {}
    public void startAttributingWakelock(int p0, int p1, int p2, long p3) {}
    public void stopAttributingWakelock(int p0, int p1, long p2) {}
    public void stopAllPendingRequests(long p0) {}
    public void changeConcurrentRequests(int p0, long p1) {}
    public int getPendingRequestCount() { return 0; }
    public synchronized long updatePendingRequestWakelockTime(long p0) { return 0L; }
    public java.lang.String toString() { return null; }
}
