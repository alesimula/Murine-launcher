package com.android.internal.telephony.uicc;

public class PinStorage extends android.os.Handler {
    public int mShortTermSecretKeyDurationMinutes;
    public PinStorage(android.content.Context p0) { super(); }
    public synchronized void storePin(java.lang.String p0, int p1) {}
    public synchronized void clearPin(int p0) {}
    public synchronized java.lang.String getPin(int p0, java.lang.String p1) { return null; }
    public synchronized int prepareUnattendedReboot(android.os.WorkSource p0) { return 0; }
    public void handleMessage(android.os.Message p0) {}
    void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
