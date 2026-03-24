package com.android.internal.telephony.emergency;

public class RadioOnStateListener {
    public static final int MSG_SERVICE_STATE_CHANGED = 2;
    public static final int MSG_RADIO_ON = 4;
    public static final int MSG_RADIO_OFF_OR_NOT_AVAILABLE = 5;
    public static final int MSG_IMS_CAPABILITY_CHANGED = 6;
    public static final int MSG_TIMEOUT_ONTIMEOUT_CALLBACK = 7;
    public static final int MSG_SATELLITE_ENABLED_CHANGED = 8;
    public RadioOnStateListener() {}
    public void waitForRadioOn(com.android.internal.telephony.Phone p0, com.android.internal.telephony.emergency.RadioOnStateListener.Callback p1, boolean p2, boolean p3, int p4) {}
    public void cleanup() {}
    public android.os.Handler getHandler() { return null; }
    public void setMaxNumRetries(int p0) {}
    public void setTimeBetweenRetriesMillis(long p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static interface Callback {
        public void onComplete(com.android.internal.telephony.emergency.RadioOnStateListener p0, boolean p1);
        public boolean isOkToCall(com.android.internal.telephony.Phone p0, int p1, boolean p2);
        public boolean onTimeout(com.android.internal.telephony.Phone p0, int p1, boolean p2);
    }
}
