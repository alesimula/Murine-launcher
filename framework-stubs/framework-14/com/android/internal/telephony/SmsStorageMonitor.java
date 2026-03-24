package com.android.internal.telephony;

public class SmsStorageMonitor extends android.os.Handler {
    com.android.internal.telephony.Phone mPhone;
    final com.android.internal.telephony.CommandsInterface mCi = null;
    boolean mStorageAvailable;
    boolean mInitialStorageAvailableStatus;
    public SmsStorageMonitor(com.android.internal.telephony.Phone p0) { super(); }
    public void sendMemoryStatusOverride(boolean p0) {}
    public void clearMemoryStatusOverride() {}
    public void setMaxRetries(int p0) {}
    public void setRetryDelayInMillis(int p0) {}
    public void dispose() {}
    public void handleMessage(android.os.Message p0) {}
    public boolean isStorageAvailable() { return false; }
}
