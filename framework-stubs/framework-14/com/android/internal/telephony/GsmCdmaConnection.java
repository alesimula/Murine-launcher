package com.android.internal.telephony;

public class GsmCdmaConnection extends com.android.internal.telephony.Connection {
    public static final java.lang.String OTASP_NUMBER = "*22899";
    com.android.internal.telephony.GsmCdmaCallTracker mOwner;
    com.android.internal.telephony.GsmCdmaCall mParent;
    boolean mDisconnected;
    int mIndex;
    long mDisconnectTime;
    com.android.internal.telephony.UUSInfo mUusInfo;
    int mPreciseCause;
    java.lang.String mVendorCause;
    com.android.internal.telephony.Connection mOrigConnection;
    android.os.Handler mHandler;
    static final int EVENT_DTMF_DONE = 1;
    static final int EVENT_PAUSE_DONE = 2;
    static final int EVENT_NEXT_POST_DIAL = 3;
    static final int EVENT_WAKE_LOCK_TIMEOUT = 4;
    static final int EVENT_DTMF_DELAY_DONE = 5;
    static final int PAUSE_DELAY_MILLIS_GSM = 3000;
    static final int PAUSE_DELAY_MILLIS_CDMA = 2000;
    static final int WAKE_LOCK_TIMEOUT_MILLIS = 60000;
    public GsmCdmaConnection(com.android.internal.telephony.GsmCdmaPhone p0, com.android.internal.telephony.DriverCall p1, com.android.internal.telephony.GsmCdmaCallTracker p2, int p3) { super(0); }
    public GsmCdmaConnection(com.android.internal.telephony.GsmCdmaPhone p0, java.lang.String p1, com.android.internal.telephony.GsmCdmaCallTracker p2, com.android.internal.telephony.GsmCdmaCall p3, com.android.internal.telephony.PhoneInternalInterface.DialArgs p4) { super(0); }
    public GsmCdmaConnection(android.content.Context p0, com.android.internal.telephony.cdma.CdmaCallWaitingNotification p1, com.android.internal.telephony.GsmCdmaCallTracker p2, com.android.internal.telephony.GsmCdmaCall p3) { super(0); }
    public void dispose() {}
    static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
    static boolean equalsBaseDialString(java.lang.String p0, java.lang.String p1) { return false; }
    public static java.lang.String formatDialString(java.lang.String p0) { return null; }
    boolean compareTo(com.android.internal.telephony.DriverCall p0) { return false; }
    public java.lang.String getOrigDialString() { return null; }
    public com.android.internal.telephony.GsmCdmaCall getCall() { return null; }
    public long getDisconnectTime() { return 0L; }
    public long getHoldDurationMillis() { return 0L; }
    public com.android.internal.telephony.Call.State getState() { return null; }
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void deflect(java.lang.String p0) throws com.android.internal.telephony.CallStateException {}
    public void transfer(java.lang.String p0, boolean p1) throws com.android.internal.telephony.CallStateException {}
    public void consultativeTransfer(com.android.internal.telephony.Connection p0) throws com.android.internal.telephony.CallStateException {}
    public void separate() throws com.android.internal.telephony.CallStateException {}
    public void proceedAfterWaitChar() {}
    public void proceedAfterWildChar(java.lang.String p0) {}
    public void cancelPostDial() {}
    void onHangupLocal() {}
    public int disconnectCauseFromCode(int p0) { return 0; }
    void onRemoteDisconnect(int p0, java.lang.String p1) {}
    public boolean onDisconnect(int p0) { return false; }
    void onLocalDisconnect() {}
    public boolean update(com.android.internal.telephony.DriverCall p0) { return false; }
    void fakeHoldBeforeDial() {}
    int getGsmCdmaIndex() throws com.android.internal.telephony.CallStateException { return 0; }
    void onConnectedInOrOut() {}
    void onConnectedConnectionMigrated() {}
    void onStartedHolding() {}
    public java.lang.String getRemainingPostDialString() { return null; }
    public void updateParent(com.android.internal.telephony.GsmCdmaCall p0, com.android.internal.telephony.GsmCdmaCall p1) {}
    protected void finalize() {}
    public int getNumberPresentation() { return 0; }
    public com.android.internal.telephony.UUSInfo getUUSInfo() { return null; }
    public int getPreciseDisconnectCause() { return 0; }
    public java.lang.String getVendorDisconnectCause() { return null; }
    public void migrateFrom(com.android.internal.telephony.Connection p0) {}
    public com.android.internal.telephony.Connection getOrigConnection() { return null; }
    public boolean isMultiparty() { return false; }
    public com.android.internal.telephony.emergency.EmergencyNumberTracker getEmergencyNumberTracker() { return null; }
    public boolean isOtaspCall() { return false; }

    class MyHandler extends android.os.Handler {
        MyHandler(com.android.internal.telephony.GsmCdmaConnection p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
